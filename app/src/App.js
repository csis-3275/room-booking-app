import React, {Component} from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import logo from './logo.svg';
import './App.css';
import Home from "./components/home/Home";
import Dashboard from "./components/dashboard/Dashboard";
import { Provider } from 'react-redux';
import store from './store';
import Support from "./components/support/Support";
import {PrivateRoute} from './PrivateRoute';
import propTypes from 'prop-types';
import { connect } from 'react-redux';

class App extends Component {
  render(){
    return (
      <Provider store={store}>
        <BrowserRouter>
            <Switch>
                <Route path="/" component={Home} exact />
                <Route path="/dashboard" component={Dashboard} />    
                <Route path="/support" component={Support}  />
            </Switch>
        </BrowserRouter>
    </Provider>
    );
  }
}



export default App;
