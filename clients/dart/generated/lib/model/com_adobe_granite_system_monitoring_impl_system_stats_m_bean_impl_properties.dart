//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {
  /// Returns a new [ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties] instance.
  ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties({
    this.schedulerPeriodExpression,
    this.jmxPeriodObjectname,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? schedulerPeriodExpression;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jmxPeriodObjectname;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.jmxPeriodObjectname == jmxPeriodObjectname;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (jmxPeriodObjectname == null ? 0 : jmxPeriodObjectname!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties[schedulerPeriodExpression=$schedulerPeriodExpression, jmxPeriodObjectname=$jmxPeriodObjectname]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.jmxPeriodObjectname != null) {
      json[r'jmx.objectname'] = this.jmxPeriodObjectname;
    } else {
      json[r'jmx.objectname'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        jmxPeriodObjectname: ConfigNodePropertyString.fromJson(json[r'jmx.objectname']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

