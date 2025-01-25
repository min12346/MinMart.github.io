<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>website</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Griffy&display=swap" rel="stylesheet">



 <style>
    :root{
     --primary : #5e99c9;
     --secondary : #5461d6;
     --main : #41138b;
     --last : #18deec;
    }
    .navbar{
    background-color: var(--primary);
    display: flex;
    width: 100%;
    height: 100px;
    justify-content: center;
    align-items: center;
    align-content: center;

    }
   .header{ 
    width: 20%;
    height: 100px;
    text-align: start;
    align-content: center;
   }
   .header>h2{
    color: var(--last);
    font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
   }
   .hading{
    color: var(--secondary);
   }
  
   .linking{
   
    display: flex;
    justify-content: space-evenly;
    align-items: center;
    width: 40%;
    height: 100px;
    text-align: start;
    align-content: center;
   }
   .linking>a{
    font-size: 16px;
    color: var(--last);
    text-decoration: none;
    padding: 10px;
    position: relative;
    z-index: 1;
    overflow: hidden;
    
   }
   .linking>a::after{
    content: '';
    position: absolute;
    width: 100%;
    border: 2px solid var(--secondary) ;
    z-index: -1;
    bottom: 0;
    left: 0;
    transform: translateX(100%);
   }
   .linking>a:hover::after{
    transition: 0.5s;
    transform: translateX(0%);
   }
   .icon{
    width: 20%;
    height: 100px;
    text-align: center;
    align-content: center;
   }
   .btn{
    color: var(--last);
   }
   .btn:hover{
    color: var(--secondary);
   }
   .dropdown{
    color: var(--secondary);
   }
   .dropdown-menu{
    background-color:var(--secondary);
   }
   .dropdown-item{
    color: black;
   }
   .icon>button{
    border: 1px solid var(--secondary);
    color: var(--secondary);
   }
   .nav-link{
    margin-bottom: 10px;
    color: black;
   }
   .nav-link:hover{
    color: var(--secondary);
   }
   .offcanvas-header>h2{
    font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
   }
   .image-item{
    background: url(https://marketofindia.co.in/blog/wp-content/uploads/2023/06/retail-shop.jpg) var(--primary);
       background-repeat: no-repeat;
       background-blend-mode: multiply;
       width: 100%;
       height: 70%;
       text-align: center;
       align-content: center;
       color: var(--last);
       text-shadow: 0px 1px 10px var(--main);
       font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
   }
   .shop{
    display: flex;
    justify-content: space-evenly;
    align-items: center;
   width: 100%;
   height: 90vh;
   }
   .image{
       background: url(https://marketofindia.co.in/blog/wp-content/uploads/2023/06/retail-shop.jpg) var(--primary);
       background-repeat: no-repeat;
       background-blend-mode: multiply;
       width: 40%;
       height: 50%;
       text-align: center;
       align-content: center;
       font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
  box-shadow: 0px 1px 10px  black;
  border-radius: 30px;

      
   }
   .text{
    width: 50%;
    height: 40%;
    padding: 20px;
    border: 1px solid;
    background: var(--primary);
    color: var(--last);
    text-align: center;
    align-content: center;
    border-radius: 20px;
    box-shadow: 0px 1px 10px  black;
    overflow-y: scroll;
   }
   .text>p{
    font-size: 2vmin;
   }
   .text>h1{
    text-decoration: underline;
    font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
   }
   .image>h1{
   color: var(--last);
   text-shadow: 0px 1px 10px var(--main);
  
   }
   .image>h2{
   color: var(--last);
   text-shadow: 0px 1px 10px var(--main);
   }
   .gallery{
    width: 100%;
   margin-top: 25px;
    text-align: center;
   }
   .gallery>h1{
    color: var(--primary);
    text-shadow: 0px 1px 10px black;
    font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
  text-decoration: underline;
   }
   
   @media screen and (max-width:1200px) {
    .shop{
        display: block;
        align-content: center;
        text-align: center;
        margin-top: 100px;
      
            
    }
    .image{
       width: 90%;
       height: 50%;
      margin-left: 5vw;
      margin-right: 5vw;
       
    }
    .text{
        width: 90%;
        margin-top: 10px;
        margin-left: 5vw;
        margin-right: 5vw;
        overflow-y: scroll;
    }
    .text>p{
        font-size: 3vmin;
    }
    .linking{
      display: none;
    }
   
   }

   * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: Arial, sans-serif;
}

header {
    background-color:var(--primary);
     width: 100%;
     height: 100px;
    display: flex;
    justify-content: space-evenly;
    align-items: center;
    color: white;
}

header .logo h1 {
    font-size: 35px;
    font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
  color: white;
}

nav ul {
    list-style-type: none;
    display: flex;
}

nav ul li {
    margin: 0 15px;
}

nav ul li a {
    text-decoration: none;
    color: white;
    font-size: 16px;
}

.search-bar input {
    padding: 8px;
    border: 1px solid #ddd;
}

.search-bar button {
    padding: 8px;
    background-color:var(--secondary);
    color: white;
    border: none;
}

main {
    padding: 20px;
}

.product-container {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
}
footer {
    background-color: var(--primary);
    color: var(--last);
    text-align: center;
    padding: 20px;
    position: relative;
    bottom: 0;
    width: 100%;
}
.product {
    width: 200px;
    padding: 10px;
    background-color: #f4f4f4;
    border-radius: 5px;
    text-align: center;
}

.product img {
    width: 100%;
    height: auto;
    border-radius: 5px;
}

.product .price {
    font-weight: bold;
    margin-top: 10px;
}



@media (max-width: 768px) {
    .search-bar {
        margin-top: 10px;
    }

    .product-container {
        flex-direction: column;
        align-items: center;
    }
}
.product-container{
  display: flex;
  justify-content: space-evenly;
  align-items: center;
}

.box1>img{
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box2>img{
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box3>img{
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box4>img{
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box5>img{
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box6>img{
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box7>img{
 
  width: 250px;
  height: 250px;
  box-shadow: 0px 1px 10px var(--primary);
  border-radius: 20px;
}
.box1{
  text-align: center;
}
.box2{
  text-align: center;
}
.box3{
  text-align: center;
}
.box4{
  text-align: center;
}
.box5{
  text-align: center;
}
.box6{
  text-align: center;
}
.box7{
  text-align: center;
}



.search-container {
            text-align: center;
            max-width: auto;
            height: auto;
            margin-top: 20px;
        }
        .search-container>h1{
          color: var(--primary);
        }

        input[type="text"] {
            padding: 10px;
            font-size: 16px;
            width: 250px;
            border: 1px solid #ccc;
            border-radius: 40px;
            border-radius: 5px;
            margin-right: 10px;
        }

        .me {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            background-color:var(--primary);
            color: white;
            border: none;
            border-radius: 5px;
        }

        .me:hover {
            background-color:var(--secondary);
        }

        
       
    
      .result-item {
        display: inline-block;
        text-align: center;
        margin: 10px;
        padding: 10px; 
        width: 220px;
        
       
    }

    .result-item img {
        width: 100%;

        height:200px ;
        display: block;
        margin: 0 auto;
    }
    

    .result-item p {
        margin: 5px 0;
        color: var(--primary);
    }

    .result-item p:hover {
       color: black;
    }
   
    .foam{
      margin-top: 10px;
      width: auto;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 600px;
       background: rgb(255, 255, 255);
    }
    .table{
       border: 2px solid var(--primary);
       width: 350px;
       height: 550px;
       text-align: center;
       align-content: center;
      
    }
    .f-head{
      color: var(--primary);
      font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
    }
    
  input{
      margin-top: 10px;
      border: 1px solid var(--primary);
      outline: var(--primary);
     
    }
    input:hover{
      border: 1px solid var(--secondary);
    }
    .hading{
      color: var(--secondary);
      font-family: "Griffy", serif;
  font-weight: 400;
  font-style: normal;
    }
    textarea{
      margin-top: 20px;
      border: 1px solid var(--primary);
      width: 250px;
      height: 100px;
    }
    textarea:hover{
      border: 1px solid var(--secondary);
      outline: var(--secondary);


    }
    .btn1{
      margin-top: 20px;
      padding: 5px;
      font-size: 15px;
      border: 1px solid var(--primary);
      background-color: var(--secondary);
      border-radius: 10px;
    }
   .btn1:hover{
      border: 1px solid var(--secondary);
      background-color: var(--primary);
    }
    .in{
       width: 250px;
    }
    /* Webkit browsers (Chrome, Safari, etc.) */
input[type="number"]::-webkit-outer-spin-button,
input[type="number"]::-webkit-inner-spin-button {
    -webkit-appearance: none;
    margin: 0;
}

/* Allow the number input to have visible spinner in all browsers */
input[type="number"] {
    width: 50%; /* Full width to display spinner */
    padding: 8px; /* Add some padding to make sure it's not too cramped */
}
 </style>
  </head>
  <body>
    <nav class="navbar fixed-top">
        <div class="container-fluid">
            <div class="header">
               <h2>Min & <span class="hading">MartShop</span></h2>
            </div>
            <div class="linking">
                <a href="">Home</a>
                <a href="index1.html">About</a>
                <div class="dropdown">
                    <button class="btn  dropdown-toggle" type="button" data-bs-toggle="dropdown">
                      our services
                    </button>
                    <ul class="dropdown-menu">
                      <li><a class="dropdown-item" href="#">clothes</a></li>
                      <li><a class="dropdown-item" href="#">electric items</a></li>
                    </ul>
                  </div>
                  <a href="index2.html">Contact</a>
                    
            </div>
            <div class="icon">
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>         
         </button>
          <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
            <div class="offcanvas-header">
              <h2 class="offcanvas-title" id="offcanvasNavbarLabel">Mint & <span class="hading">Martshop</span></h2>
              <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body text-center">
              <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                <li class="nav-item">
                  <a class="nav-link " aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="index1.html">About</a>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Our service
                  </a>
                  <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">clothes</a></li>
                    <li><a class="dropdown-item" href="#">electric items</a></li>
                  </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="index2.html">Contact</a>
                  </li>
                
              </ul>
             <div class="image-item">
                <h1>online shop</h1>
                <h2>order now</h2>
             </div>
            </div>
          </div>
        </div>
      </nav>
     <div class="shop">
        <div class="image">
         <h1>online shop</h1>
         <h2>order now</h2>
        </div>
        <div class="text">
            <h1>our shop</h1>
            <p>  Lorem ipsum dolor sit, amet consectetur adipisicing elit. Illum, nobis! Odio, vel quis molestiae debitis impedit ex expedita similique sit commodi, obcaecati, incidunt repudiandae nisi magni eos quo error quam illum magnam placeat quasi dolorum aliquam nobis voluptas! Deleniti eaque asperiores consectetur nobis dicta corrupti id nostrum quisquam, eveniet assumenda, facilis odio nam totam corporis omnis nulla, vero aut ipsam inventore porro laborum quam quidem. In voluptatibus nam harum vitae dolores sunt dolor maxime laboriosam, molestiae, ipsum provident quasi autem consequuntur culpa tempora temporibus cupiditate cumque incidunt assumenda. Alias quos accusamus pariatur minima optio fugit, porro provident quis deleniti iusto.Lorem ipsum dolncidunt vel voluptates dolorem enim modi sunt tempora aliquam. Eligendi, architecto? Consequuntur dolor iusto, in esse quisquam repudiandae quidem excepturi eum nostrum sunt maximeque, culpa veritatis obcaecati ex. Repudiandae, velit sunt! Obcaecati consequisquam aut iure optio minus, laborum porro, aperiam nulla officiis molestias ipsum? Odio ratione quidem consecperiam excepturi dicta eligendi id adipisci soluta vitae explicabo ea atqueslibero labore voluptatum quam eius! Omnis, voluptatem sint?</p>
        </div>
     </div>

    

        <header>
          <div class="logo">
              <h1>Min & <span class="hadings">MartShop</span></h1>
          </div>
         
             
         
      </header>






      <div class="search-container">
      <h1>Shop Item Search click the discription</h1>
      <input type="text" id="searchInput" placeholder="Search for an item...">
      <button class="me" onclick="searchItem()">Search</button>
      <div id="results" class="results"></div>
  </div>
      







  <div class="foam">
    <div class="table">
      <form onsubmit="sendEmail(); reset(); return false;">
        <h1 class="f-head">Mint &<span class="hading"> Mart shop</span></h1>
        <label for="name">Your Name:</label><br>
        <input  type="text" id="name" placeholder="Your Name" required><br>
  
        <label for="item-name">Item Name:</label><br>
        <input  type="text" id="item-name" placeholder="Item Name" required><br>
  
        <label for="item-quantity">Item Quantity:</label><br>
        <input class="in" type="number" id="item-quantity" placeholder="Item Quantity" required min="1" max="100" step="1"><br>
        
  
        <label for="message">Address:</label><br>
        <textarea id="message" placeholder="Address" required></textarea><br>
  
        <button class="btn1" type="submit">Send Message</button>
      </form>
    </div>
  </div>







  <div class="gallery">
    <h1>Main Item For Selling In Shop</h1>
    </div>



  <main>
    <section class="shoping">
        <div class="product-container">
            <div class="box1">
             <img src="image/pic1 (2).jpeg">
             <h1>Rs :800</h1>
            </div>
            <div class="box2">
              <img src="image/pic1 (3).jpeg">
              <h1>Rs :800</h1>
            </div>
            <div class="box3">
             <img src="image/pic1 (4).jpeg">
             <h1>Rs :800</h1>
            </div>
            <div class="box4">
               <img src="image/pic1 (5).jpeg">
               <h1>Rs :800</h1>
            </div>
            <div class="box5">
              <img src="image/pic1 (6).jpeg">
              <h1>Rs :800</h1>
           </div>
           <div class="box7">
            <img src="image/pic1 (4).jpeg">
            <h1>Rs :800</h1>
         </div>
         <div class="box6">
          <img src="image/pic1 (3).jpeg">
          <h1>Rs :800</h1>
       </div>
       <div class="box6">
        <img src="image/pic1 (3).jpeg">
        <h1>Rs :800</h1>
     </div>
     <div class="box6">
      <img src="image/pic1 (3).jpeg">
      <h1>Rs :800</h1>
   </div>
   <div class="box6">
    <img src="image/pic1 (3).jpeg">
    <h1>Rs :800</h1>
 </div>
 <div class="box6">
  <img src="image/pic1 (3).jpeg">
  <h1>Rs :800</h1>
</div>
<div class="box6">
<img src="image/pic1 (3).jpeg">
<h1>Rs :800</h1>
</div>
        </div>
    </section>
</main>

     
  
      
<footer>
  <div class="footer-content">
      <p>&copy; 2024 Min & Martshop. All rights reserved.</p>
  </div>
</footer>


        
   
       
   
     
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
         
  </script>
  <script>
 function searchItem() {
    const input = document.getElementById("searchInput").value.toLowerCase();
    const resultsDiv = document.getElementById("results");

    // Example items with names, images, descriptions, and prices
    const items = [
        { name: "Shoes", image: "image/pic1 (5).jpeg", description: "Comfortable running shoes", price: "$50" },
        { name: "headphone", image: "image/pic1 (3).jpeg", description: "Fresh and ripe bananas", price: "$2" },
        { name: "watch", image: "image/pic1 (2).jpeg", description: "Juicy oranges", price: "$3" },
        { name: "rings", image: "image/pic1 (6).jpeg", description: "Sweet red grapes", price: "$4" },
        { name: "Shoes", image: "image/pic1 (4).jpeg", description: "Tropical pineapple", price: "$5" },
        { name: "watch", image: "image/pic1 (2).jpeg", description: "Fresh strawberries", price: "$6" },
        { name: "Shoes", image: "image/pic1 (4).jpeg", description: "Comfortable running shoes", price: "$50" },
        { name: "watch", image: "image/pic1 (2).jpeg", description: "Fresh and ripe bananas", price: "$2" },
        { name: "Shoes", image: "image/pic1 (4).jpeg", description: "Juicy oranges", price: "$3" },
        { name: "headphone", image: "image/pic1 (3).jpeg", description: "Sweet red grapes", price: "$4" },
        { name: "Shoes", image: "image/pic1 (5).jpeg", description: "Tropical pineapple", price: "$5" },
        { name: "Shoes", image: "image/pic1 (4).jpeg", description: "Fresh strawberries", price: "$6" }
    ];

    // Filter items based on search input
    const filteredItems = items.filter(item => item.name.toLowerCase().includes(input));

    // Display results
    if (filteredItems.length > 0) {
        resultsDiv.innerHTML = ""; // Clear previous results
        filteredItems.forEach(item => {
            const resultDiv = document.createElement("div");
            resultDiv.classList.add("result-item");

            const img = document.createElement("img");
            img.src = item.image;
            img.alt = item.name;

            // Display item name always at the top
            const name = document.createElement("p");
            name.textContent = item.name;

            // Create the button for description
            const descriptionButton = document.createElement("p");
            descriptionButton.textContent = "Click for description"; // Button to reveal description and price
            descriptionButton.style.cursor = "pointer";  // Make description clickable

            // Create a div to hold the description and price, initially hidden
            const detailsDiv = document.createElement("div");
            detailsDiv.style.display = "none";  // Initially hide description and price

            const price = document.createElement("p");
            price.textContent = item.price;
            price.style.fontWeight = "bold"; // Styling the price to stand out

            const itemDescription = document.createElement("p");
            itemDescription.textContent = item.description;
            itemDescription.style.fontStyle = "italic"; // Style the description distinctively

            // Toggle visibility of description and price when clicking the description button
            descriptionButton.addEventListener("click", function() {
                // Toggle visibility of the description and price
                const isVisible = detailsDiv.style.display === "block";
                detailsDiv.style.display = isVisible ? "none" : "block"; // Toggle visibility

                // Change button text based on visibility
                descriptionButton.textContent = isVisible ? "Click for description" : "Hide description";
            });

            // Create the "Buy Now" button
            const buyButton = document.createElement("button");
            buyButton.textContent = "Buy Now";
            buyButton.style.marginTop = "10px"; // Add some space above the button

            // Set the button colors (normal and clicked)
            buyButton.style.backgroundColor = "#5e99c9";  // Normal color
            buyButton.style.color = "white";              // White text color
            buyButton.style.border = "none";              // No border
            buyButton.style.padding = "10px 20px";        // Padding for the button
            buyButton.style.fontSize = "16px";            // Font size for the button
            buyButton.style.cursor = "pointer";          // Cursor pointer to indicate it's clickable
            buyButton.style.borderRadius = "5px";        // Rounded corners
            buyButton.style.transition = "background-color 0.3s";  // Smooth transition for color change

            // When the "Buy Now" button is clicked, create and display the form
            buyButton.addEventListener("click", function() {
                buyButton.style.backgroundColor = "#9A7E6F"; // Change color on click
                alert("If you buy this item, you need to fill out the form.");
        
            });

            // Append elements to the resultDiv
            resultDiv.appendChild(img);
            resultDiv.appendChild(name);  // Item name is at the top
            resultDiv.appendChild(descriptionButton);  // Clickable description button
            resultDiv.appendChild(detailsDiv);  // Initially hidden details div
            detailsDiv.appendChild(itemDescription); // Add description
            detailsDiv.appendChild(price); // Add price
            resultDiv.appendChild(buyButton); // Add the "Buy Now" button

            // Append the resultDiv to the results container
            resultsDiv.appendChild(resultDiv);
        });
    } else {
        resultsDiv.innerHTML = "No items found.";
    }
}


</script>


<script src="https://cdn.emailjs.com/dist/email.min.js"></script>
<script>
  // Initialize EmailJS
  emailjs.init("YOUR_USER_ID");

  // Send email function
  function sendEmail() {
    // Collect form data
    var form = document.getElementById('contactForm');
    var name = document.getElementById('name').value;
    var itemName = document.getElementById('item-name').value;
    var itemQuantity = document.getElementById('item-quantity').value;
    var address = document.getElementById('message').value;

    // Create an email data object
    var emailData = {
      name: name,
      item_name: itemName,
      item_quantity: itemQuantity,
      address: address,
    };

    // Send email using EmailJS
    emailjs.send("YOUR_SERVICE_ID", "YOUR_TEMPLATE_ID", emailData)
      .then(function(response) {
        alert("Message Sent Successfully!");
        form.reset(); // Reset the form fields after submission
      })
      .catch(function(error) {
        alert("Failed to send message: " + error.text);
      });
  }
</script>






    
<script>
  // JavaScript function to get the item quantity value
  function getItemQuantity() {
    const quantity = document.getElementById('item-quantity').value; 
  }
</script>

  </body>
</html>
