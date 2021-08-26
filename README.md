# Reply Spring - A simple Spring Boot application

A simple Spring Boot REST API application designed while learning.

## REST API docs
| Endpoint          | Description |
| -----------       | ----------- |
| /reply/{message}    | Shows the supplied message. Shows `Message is empty` is no message is given|
| /v2/reply/{command}-{string} | Performs operations on the given string based on given commands. Shows `Message is empty` if no commands and strings are given  <br /><br />**Commands**:<br />1 - Reverse the string<br />2 - MD5 hash the string|