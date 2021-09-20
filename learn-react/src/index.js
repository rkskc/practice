import React from 'react';
import ReactDOM from 'react-dom';
import Faker from 'faker';

import ApprovalCard from './ApprovalCard';
import Comment from './Comment';

const App = () => {
	return (
		<div className="ui container comments">
			<ApprovalCard />
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
