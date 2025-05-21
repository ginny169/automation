# Webdriver and Locators

## Webdriver methods

- Why we can write code WebDriver driver = new ChromeDriver()? Answer: Because we have a class ChromeDriver that extends WebDriver. WebDriver is an interface that defines the contract for all WebDriver implementations. ChromeDriver is a concrete implementation of WebDriver. WebDriver is like an abstract layer that provides a common interface for interacting with different browsers.
- Take another example: Animal is an abstract class that represents all animals. Dog is a concrete class that extends Animal. Cat is another concrete class that extends Animal. If we have a method that takes an Animal as a parameter, we can pass any Animal that extends Animal to that method.

## Understanding HTML element

An HTML element is formed by

- a start tag
- an end tag
- and optionally a set of attributes.

An HTML element can be called as a node in the DOM tree.

```html
<div class="container">
  <div class="row">
    <div class="col-md-6">
      <div class="card">
        <div class="card-body">
          <div>
            <h5 class="card-title">Card title</h5>
            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
            <a href="#" class="btn btn-primary">Go somewhere</a>
          </div>
        </div>
      </div>
    </div>
    <hr class="d-md-none">
    <button class="btn btn-primary">Primary</button>
  </div>
</div>
```

## Locators

Selenium supports a number of different locator strategies:

- id
- css
- xpath
- class name
- tag name
- name
- link text
- partial link text

`id`, `name`, `class name`, `link text`, `partial link text` are mostly related to html attributes.

### XPath

2 types of xpath

- Absolute path: using single slash `/` to locate the element. E.g. /html/body/div/div/input
- Relative path: using double slash `//` to locate the element. E.g. //input
An XPath expression is a sequence of location steps separated by a combinator.

| XPath             | syntax                                 | description                                                                                          |
| ----------------- | -------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| tag               | //input                                | select all elements with tags `input`                                                                |
| wildcard (*)      | //*[@id='email']                       | select all elements with ANY tags and `id` email                                                     |
| tag and attribute | //input[@id='email']                   | select all elements with tags `input` and `id` email                                                 |
| index             | //input[2]                             | select all elements with tags `input` and index 2. Index starts from 1                               |
| contains          | //input[contains(@id, 'mail')]         | select all elements with tags `input` and `id` containing mail                                       |
| starts-with       | //input[starts-with(@id, 'e')]         | select all elements with tags `input` and `id` starting with e                                       |
| text              | //label[text()='First name:']          | select all elements with tags `label` and text `First name:`                                         |
| and               | //input[@type='text' and @name='name'] | select all elements with tags `input` and `type` text and `name` name                                |
| or                | //input[@type='text' or @name='name']  | select all elements with tags `input` and `type` text or `name` name                                 |
| following         | //input//following::div                | select all elements with tags `input` and then select all following elements with tags `div`         |
| preceding         | //input//preceding::div                | select all elements with tags `input` and then select all preceding elements with tags `div`         |
| descendant        | //input//descendant::div               | select all elements with tags `input` and then select all descendant elements with tags `div`        |
| ancestor          | //input//ancestor::div                 | select all elements with tags `input` and then select all ancestor elements with tags `div`          |
| following-sibling | //input//following-sibling::div        | select all elements with tags `input` and then select all following-sibling elements with tags `div` |
| parent            | //input//parent::div                   | select all elements with tags `input` and then select all parent elements with tags `div`            |
| self              | //input//self::div                     | select all elements with tags `input` and then select all self elements with tags `div`              |

## CSS selectors

- class name: `.class-name`
- id: `#id`
- tag: `tag-name`
- css selector with attribute: `tag-name[attribute]`
  - with attribute and value: `tag-name[attribute=value]`
  - with attribute and contains: `tag-name[attribute*=value]`
  - with attribute and starts with: `tag-name[attribute^=value]`
  - with attribute and ends with: `tag-name[attribute$=value]`
- index: `tag-name:nth-child(n)`
- [Combination](https://www.w3schools.com/css/css_combinators.asp):
  - Descendant combinator (space)
  - Child combinator (>)
  - Next sibling combinator (+)
  - Subsequent-sibling combinator (~)

## References

- [Selenium Locators](https://www.selenium.dev/documentation/webdriver/elements/locators/)
- [XPATH Guru99](https://www.guru99.com/xpath-selenium.html)
- [CSS selectors](https://www.w3schools.com/css/css_selectors.asp)

## Exercises

in Xpath, what are diference between?

- following vs preceding
- following vs descendant
- ancestor vs descendant
- following vs following-sibling
- preceding vs preceding-sibling
- parent vs ancestor
- preceding vs ancestor