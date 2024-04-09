        $('#jstree').jstree({
            'core': {
                'data': [
                    {
                        "id": "1",
                        "text": "Root",
                        "children": [
                            {
                                "id": "2",
                                "text": "Child 1"
                            },
                            {
                                "id": "3",
                                "text": "Child 2"
                            }
                        ]
                    }
                ]
            }
        });