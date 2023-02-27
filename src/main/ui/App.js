'use strict';

const React = require('react');
const ReactDOM = require('react-dom');

export default function Header() {
    return (<a href="/">Home</a>)
}

ReactDOM.render(
	<Header />, document.getElementById('header')
)