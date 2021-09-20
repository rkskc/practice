import React from 'react';

const ApprovalCard = properties => {
	return (
		<div className="ui card">
			<div className="content">{properties.children}</div>
			<div className="extra content ui two buttons">
				{/*I hate being asked to use <div> buttons. Browsers and screen readers already know how to tab through and click on buttons. Stop reinventing the wheel.*/}
					<button className="ui red button">Reject</button>
					<button className="ui green button">Approve</button>
			</div>
		</div>
	)
}

export default ApprovalCard
