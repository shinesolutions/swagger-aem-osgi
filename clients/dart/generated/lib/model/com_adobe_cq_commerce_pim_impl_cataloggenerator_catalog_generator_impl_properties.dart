//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {
  /// Returns a new [ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties] instance.
  ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties({
    this.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize,
    this.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname,
    this.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodCommercePeriodCataloggeneratorPeriodBucketname;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties &&
    other.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize == cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize &&
    other.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname == cqPeriodCommercePeriodCataloggeneratorPeriodBucketname &&
    other.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties == cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize == null ? 0 : cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize!.hashCode) +
    (cqPeriodCommercePeriodCataloggeneratorPeriodBucketname == null ? 0 : cqPeriodCommercePeriodCataloggeneratorPeriodBucketname!.hashCode) +
    (cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties == null ? 0 : cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties!.hashCode);

  @override
  String toString() => 'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties[cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize=$cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize, cqPeriodCommercePeriodCataloggeneratorPeriodBucketname=$cqPeriodCommercePeriodCataloggeneratorPeriodBucketname, cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties=$cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize != null) {
      json[r'cq.commerce.cataloggenerator.bucketsize'] = this.cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize;
    } else {
      json[r'cq.commerce.cataloggenerator.bucketsize'] = null;
    }
    if (this.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname != null) {
      json[r'cq.commerce.cataloggenerator.bucketname'] = this.cqPeriodCommercePeriodCataloggeneratorPeriodBucketname;
    } else {
      json[r'cq.commerce.cataloggenerator.bucketname'] = null;
    }
    if (this.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties != null) {
      json[r'cq.commerce.cataloggenerator.excludedtemplateproperties'] = this.cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties;
    } else {
      json[r'cq.commerce.cataloggenerator.excludedtemplateproperties'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(
        cqPeriodCommercePeriodCataloggeneratorPeriodBucketsize: ConfigNodePropertyInteger.fromJson(json[r'cq.commerce.cataloggenerator.bucketsize']),
        cqPeriodCommercePeriodCataloggeneratorPeriodBucketname: ConfigNodePropertyString.fromJson(json[r'cq.commerce.cataloggenerator.bucketname']),
        cqPeriodCommercePeriodCataloggeneratorPeriodExcludedtemplateproperties: ConfigNodePropertyArray.fromJson(json[r'cq.commerce.cataloggenerator.excludedtemplateproperties']),
      );
    }
    return null;
  }

  static List<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

