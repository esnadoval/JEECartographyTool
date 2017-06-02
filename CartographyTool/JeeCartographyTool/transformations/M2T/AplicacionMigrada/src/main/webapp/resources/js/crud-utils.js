var newRow = false;
var currentId;
var filters = {};
jQuery(document).ready(function() {
    configDefaultTable();
});


/**
 * Table filter Uils
 */
function configDefaultTable() {
    configTable(PrimeFaces.widgets.wTblData);
}
function configTable(wtable) {
    jQuery(wtable.jqId).find('th .ui-column-filter').each(function() {
        filters[this.id] = null;
    });
    var oldFilterFunction = wtable.filter;
    wtable.filter = function() {
        // filters={};
        wtable.selection = [];
        for (indx in filters) {
            var valor = jQuery(document.getElementById(indx)).val();
            if (valor && valor.length > 0)
                filters[indx] = valor;
        }
        oldFilterFunction.call(wtable);
    }
}


function restoreFiltersValues() {
    for (idi in filters) {
        if (idi) {
            jQuery(document.getElementById(idi)).val(filters[idi]);
        }
    }
}


/**
 * CRUD Utils
 */
function save() {
    if (newRow)
    {
        fncCreate();
    } else {
        fncUpdate();
    }
}

function removeSelected() {
    fncDelete(currentId);
}


/**
 * FileUtils
 */
function openDownloadWindow(xhr, status, args) {
    window.open("../f?fid=" + args.fid);
}

/**
 * Utils
 */
function isInt(x) {
    var y = parseInt(x);
    if (isNaN(y))
        return false;
    return x == y && x.toString() == y.toString();
}