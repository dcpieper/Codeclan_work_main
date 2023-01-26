from flask import render_template
from app import app
from models.order_list import orders

@app.route('/orders')
def index():
    return render_template('index.html', title='Home', orders=orders)

@app.route('/orders/<id>')
def order(id):
    # show_order = orders[int(id)]
    return render_template('show_order.html', title='Home', orders=orders[int(id)])