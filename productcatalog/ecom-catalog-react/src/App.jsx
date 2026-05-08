import { useEffect, useState } from 'react';
import './App.css';
import ProductList from './ProductList';
import CategoryFilter from './CategoryFilter';

function App() {
  const [products, setProducts] = useState([]);
  const [categories, setCategories] = useState([]);
  const [selectedCategory, setSelectedCategory] = useState(null);
  const [searchTerm, setSearchTerm] = useState("");
  const [sortOrder, setSortOrder] = useState("asc");

  useEffect(() => {
    fetch("http://localhost:8080/api/products")
      .then(res => res.json())
      .then(data => setProducts(data))
      .catch(err => console.error("Error fetching products:", err));

    fetch("http://localhost:8080/api/categories")
      .then(res => res.json())
      .then(data => setCategories(data))
      .catch(err => console.error("Error fetching categories:", err));
  }, []);

  const handleSearchChange = (e) => setSearchTerm(e.target.value);
  const handleSortChange = (e) => setSortOrder(e.target.value);
  const handleCategorySelect = (categoryId) =>
    setSelectedCategory(categoryId ? Number(categoryId) : null);

  const filteredProducts = products
    .filter(product =>
      selectedCategory === null || product.category?.id === selectedCategory
    )
    .filter(product =>
      searchTerm ? product.name.toLowerCase().includes(searchTerm.toLowerCase()) : true
    )
    .sort((a, b) =>
      sortOrder === "asc" ? a.price - b.price : b.price - a.price
    );

  return (
    <div className='container'>
      <h1 className='my-4'>Product Catalog</h1>
      <div className='row align-items-center mb-4'>
        <div className='col-md-3 col-sm-12 mb-2'>
          <CategoryFilter categories={categories} onSelect={handleCategorySelect} />
        </div>
        <div className='col-md-5 col-sm-12 mb-2'>
          <input
            type="text"
            className='form-control mb-2'
            placeholder='Search for products'
            value={searchTerm}
            onChange={handleSearchChange}
          />
          <select className='form-control' value={sortOrder} onChange={handleSortChange}>
            <option value="asc">Sort by Price: Low to High</option>
            <option value="desc">Sort by Price: High to Low</option>
          </select>
        </div>
      </div>
      <div>
        {filteredProducts.length ? (
          <ProductList products={filteredProducts} />
        ) : (
          <p>No Products Found</p>
        )}
      </div>
    </div>
  );
}

export default App;
