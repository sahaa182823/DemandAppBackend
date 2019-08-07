import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
//import Home from './components/Home';
import * as serviceWorker from './serviceWorker';
import {Provider} from 'react-redux';
import Store from '../src/store/store'
//import Test from './Test'

//ReactDOM.render(<Test />, document.getElementById('root'));
const store = Store()

ReactDOM.render(<Provider store={store}>
    
    <App/>
    
    
    </Provider>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
