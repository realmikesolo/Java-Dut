# Java Laboratory Work №2: Library Management System

## Overview

This Java project is a simple Library Management System that allows librarians to manage items (books, DVDs) and patrons (clients) of a library. The system is designed to handle basic library operations such as adding and removing items, registering patrons, lending and returning items, as well as displaying lists of available and borrowed items.

## Features
- Manage Library Items: Add and remove books and DVDs from the library's collection.
- Patron Management: Register library patrons and manage their borrowing activities.
- Borrowing and Returning: Facilitate the borrowing and returning process for items.
- Track Item Status: Keep track of which items are available and which are currently borrowed, along with their borrowers.

## Classes and Interfaces
- Item (Abstract Class): Represents a general item in the library with common attributes like title, unique ID, and borrow status.
- Book: Inherits from Item. Contains specific attributes like author.
- DVD: Inherits from Item. Contains specific attributes like duration.
- Patron: Represents a library patron, with details and a list of borrowed items.
- IManageable (Interface): Defines essential library management operations.
Library: Implements IManageable and provides functionality to manage items and patrons.
