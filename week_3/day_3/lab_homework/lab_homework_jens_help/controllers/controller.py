from flask import render_template
from app import app
from models.order_list import orders

@app.route('/orders')
def index():
    return render_template('index.html', title='Home', orders=orders)

@app.route('/orders/<index>')
def one_order(index):
    show_order = orders[int(index)]
    return render_template('show_order.html', orders=show_order)