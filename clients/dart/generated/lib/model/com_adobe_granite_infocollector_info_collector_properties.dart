//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteInfocollectorInfoCollectorProperties {
  /// Returns a new [ComAdobeGraniteInfocollectorInfoCollectorProperties] instance.
  ComAdobeGraniteInfocollectorInfoCollectorProperties({
    this.granitePeriodInfocollectorPeriodIncludeThreadDumps,
    this.granitePeriodInfocollectorPeriodIncludeHeapDump,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodInfocollectorPeriodIncludeThreadDumps;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? granitePeriodInfocollectorPeriodIncludeHeapDump;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteInfocollectorInfoCollectorProperties &&
    other.granitePeriodInfocollectorPeriodIncludeThreadDumps == granitePeriodInfocollectorPeriodIncludeThreadDumps &&
    other.granitePeriodInfocollectorPeriodIncludeHeapDump == granitePeriodInfocollectorPeriodIncludeHeapDump;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (granitePeriodInfocollectorPeriodIncludeThreadDumps == null ? 0 : granitePeriodInfocollectorPeriodIncludeThreadDumps!.hashCode) +
    (granitePeriodInfocollectorPeriodIncludeHeapDump == null ? 0 : granitePeriodInfocollectorPeriodIncludeHeapDump!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteInfocollectorInfoCollectorProperties[granitePeriodInfocollectorPeriodIncludeThreadDumps=$granitePeriodInfocollectorPeriodIncludeThreadDumps, granitePeriodInfocollectorPeriodIncludeHeapDump=$granitePeriodInfocollectorPeriodIncludeHeapDump]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.granitePeriodInfocollectorPeriodIncludeThreadDumps != null) {
      json[r'granite.infocollector.includeThreadDumps'] = this.granitePeriodInfocollectorPeriodIncludeThreadDumps;
    } else {
      json[r'granite.infocollector.includeThreadDumps'] = null;
    }
    if (this.granitePeriodInfocollectorPeriodIncludeHeapDump != null) {
      json[r'granite.infocollector.includeHeapDump'] = this.granitePeriodInfocollectorPeriodIncludeHeapDump;
    } else {
      json[r'granite.infocollector.includeHeapDump'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteInfocollectorInfoCollectorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteInfocollectorInfoCollectorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteInfocollectorInfoCollectorProperties(
        granitePeriodInfocollectorPeriodIncludeThreadDumps: ConfigNodePropertyBoolean.fromJson(json[r'granite.infocollector.includeThreadDumps']),
        granitePeriodInfocollectorPeriodIncludeHeapDump: ConfigNodePropertyBoolean.fromJson(json[r'granite.infocollector.includeHeapDump']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteInfocollectorInfoCollectorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteInfocollectorInfoCollectorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteInfocollectorInfoCollectorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteInfocollectorInfoCollectorProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteInfocollectorInfoCollectorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteInfocollectorInfoCollectorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteInfocollectorInfoCollectorProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteInfocollectorInfoCollectorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteInfocollectorInfoCollectorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteInfocollectorInfoCollectorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

