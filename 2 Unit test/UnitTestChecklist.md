# Unit Test Checklist
Summary : 
- [Go to 'Which parts to test' section](#which-parts-to-test)  
- [Go to 'Which cases to test' section](#which-cases-to-test)  
- [Go to 'Which elements to test' section](#which-elements-to-test)  
- [Go to 'Other' section](#other)  
- [Go to 'FAQ' section](#frequently-asked-questions)  

---

# Which parts to test
* Front end
* Back end
* Database

## Which cases to test
* Valid cases
  * Normal cases
  * Boundary cases
  * Special cases
* Invalid cases
  * Out of bounds cases
  * Min, Max cases
  * Invalid type cases

## Which elements to test
* Number
* Text
* Text Area
* Password
* Validation
* File Upload/Download
* List
* Alert/Confirm/Toast

---

## Number
* Boundary
* DB boundary
* Float
* Negative
* Characters
* Non `abc` characters (: , /)
* Symbols (↑ ☻)
* Number start with zero, hexa, oct etc (001, 0x, FF)

## Text
* Encode ( Latin, Cyrillic, Hiragana, Katakana)
* Byte ( 4 byte Kanji, 3 byte Emoji, 2 byte  Katakana, 1 byte Latin)
* Length ( boundary value, equivalence partitioning, mostly use both of it)
* Injection (SQL, XSS, XSRF)

## Text Area
* Same as text
* A lot of enters
* At max length check display correctly

## Password
* Confirmation - non-readable by default
* Protect from auto completion - only English alpha numeric (for old web browsers)
* Copy paste (ctrl+v, shift insert, mobile paste, right click and paste, Linux right click)

## Validation
* Copy paste (ctrl+v, shift insert, mobile paste, right click and paste, Linux right click)
* At least back-end validation must be tested
* Mail, Domain, Type (string, number, telephone number, zip code etc)
* Only for user id, email case insensitive

## File Upload
### Type
* Single Request (all in one) -> safe
* Multiple Request (request per field) -> unsafe

### Select method
* Drag and Drop
* Browse and choose
* If you use both need to test more

### File
* Extension (jpg, jpeg, png, tiff, gif, svg, psd, CMYK-RGB etc)
* Resolutions and size (1x1, bigxbig, big size, small size, 0 byte)
* Injection (php.jpg, exe.jpg, script.js.png, zipbomb.zip.jpg)

## List
* Pagination ( zero, full, full+1)
* Delete last page data
* DB does not exist (table is deleted)
* Create mass data and check pagination, create concurrency case may cause dead lock

## Alert, Confirm
* Alert or confirm shows active tab
* Click on back button when appears alert or confirm check it appears again or not

---

# Other

## Design
* OS compatibility
* Browser compatibility
* Screen compatibility (800x600, 1024x768, Mobile, Tablet, browser minimize, maximize)
* Button, menu, resolution, layout, table, fonts displays correctly
* Messages are correct and correctly showed

## User Role
* Admin/Basic user swapping each other by login/logout and check view of the web
* Check protect privacy correctly
* Session and cookies expires?
* Request, page, session, application scope

---

# Frequently asked questions
* Mouse double click protection
* Is mouse over tooltip correct?
* Short cut works correctly?
* Tab and cursor/focus shifts correctly?
* A->B->A system state shows correctly
* Reset/keep field value correctly
* Back button and forward button
* Related windows show correctly
* Is an error/info message correct?

