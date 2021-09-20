import React from 'react';

const Comment = properties => {
	return (
		<div className="comment">
			<a href="/" className="avatar">
				<img alt="avatar" src={properties.avatar} />
			</a>
			<div className="content">
				<a href="/" className="author">{properties.author}</a>
				<div className="metadata">
					<span className="date">{properties.date}</span>
				</div>
				<div className="text">{properties.text}</div>
			</div>
		</div>
	)
}

export default Comment
