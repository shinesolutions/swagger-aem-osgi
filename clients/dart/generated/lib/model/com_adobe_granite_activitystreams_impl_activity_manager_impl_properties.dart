//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
  /// Returns a new [ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties] instance.
  ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties({
    this.aggregatePeriodRelationships,
    this.aggregatePeriodDescendPeriodVirtual,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? aggregatePeriodRelationships;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? aggregatePeriodDescendPeriodVirtual;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties &&
    other.aggregatePeriodRelationships == aggregatePeriodRelationships &&
    other.aggregatePeriodDescendPeriodVirtual == aggregatePeriodDescendPeriodVirtual;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (aggregatePeriodRelationships == null ? 0 : aggregatePeriodRelationships!.hashCode) +
    (aggregatePeriodDescendPeriodVirtual == null ? 0 : aggregatePeriodDescendPeriodVirtual!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties[aggregatePeriodRelationships=$aggregatePeriodRelationships, aggregatePeriodDescendPeriodVirtual=$aggregatePeriodDescendPeriodVirtual]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.aggregatePeriodRelationships != null) {
      json[r'aggregate.relationships'] = this.aggregatePeriodRelationships;
    } else {
      json[r'aggregate.relationships'] = null;
    }
    if (this.aggregatePeriodDescendPeriodVirtual != null) {
      json[r'aggregate.descend.virtual'] = this.aggregatePeriodDescendPeriodVirtual;
    } else {
      json[r'aggregate.descend.virtual'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(
        aggregatePeriodRelationships: ConfigNodePropertyArray.fromJson(json[r'aggregate.relationships']),
        aggregatePeriodDescendPeriodVirtual: ConfigNodePropertyBoolean.fromJson(json[r'aggregate.descend.virtual']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

