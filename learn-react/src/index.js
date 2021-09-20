import React from 'react';
import ReactDOM from 'react-dom';
import Comment from './Comment';
import Faker from 'faker';

const App = () => {
	return (
		<div className="ui container comments">
			<Comment
				author={Faker.internet.userName()}
				avatar={Faker.image.avatar()}
				date="3 minutes ago"
				text="Hello, World!"
			/>
			<Comment
				author={Faker.internet.userName()}
				avatar={Faker.image.avatar()}
				date="3 minutes ago"
				text="Hello, World!"
			/>
			<Comment
				author={Faker.internet.userName()}
				avatar={Faker.image.avatar()}
				date="3 minutes ago"
				text="Hello, World!"
			/>
			<Comment
				author={Faker.internet.userName()}
				avatar={Faker.image.avatar()}
				date="3 minutes ago"
				text="Hello, World!"
			/>
			<Comment
				author={Faker.internet.userName()}
				avatar={Faker.image.avatar()}
				date="3 minutes ago"
				text="Hello, World!"
			/>
		</div>
	);
}

ReactDOM.render(
  <App />,
  document.getElementById('root')
);

if(module.hot) {
	module.hot.accept();
}
