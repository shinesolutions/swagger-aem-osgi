//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
  /// Returns a new [OrgApacheSlingEngineImplLogRequestLoggerServiceProperties] instance.
  OrgApacheSlingEngineImplLogRequestLoggerServiceProperties({
    this.requestPeriodLogPeriodServicePeriodFormat,
    this.requestPeriodLogPeriodServicePeriodOutput,
    this.requestPeriodLogPeriodServicePeriodOutputtype,
    this.requestPeriodLogPeriodServicePeriodOnentry,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? requestPeriodLogPeriodServicePeriodFormat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? requestPeriodLogPeriodServicePeriodOutput;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? requestPeriodLogPeriodServicePeriodOutputtype;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? requestPeriodLogPeriodServicePeriodOnentry;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEngineImplLogRequestLoggerServiceProperties &&
    other.requestPeriodLogPeriodServicePeriodFormat == requestPeriodLogPeriodServicePeriodFormat &&
    other.requestPeriodLogPeriodServicePeriodOutput == requestPeriodLogPeriodServicePeriodOutput &&
    other.requestPeriodLogPeriodServicePeriodOutputtype == requestPeriodLogPeriodServicePeriodOutputtype &&
    other.requestPeriodLogPeriodServicePeriodOnentry == requestPeriodLogPeriodServicePeriodOnentry;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (requestPeriodLogPeriodServicePeriodFormat == null ? 0 : requestPeriodLogPeriodServicePeriodFormat!.hashCode) +
    (requestPeriodLogPeriodServicePeriodOutput == null ? 0 : requestPeriodLogPeriodServicePeriodOutput!.hashCode) +
    (requestPeriodLogPeriodServicePeriodOutputtype == null ? 0 : requestPeriodLogPeriodServicePeriodOutputtype!.hashCode) +
    (requestPeriodLogPeriodServicePeriodOnentry == null ? 0 : requestPeriodLogPeriodServicePeriodOnentry!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEngineImplLogRequestLoggerServiceProperties[requestPeriodLogPeriodServicePeriodFormat=$requestPeriodLogPeriodServicePeriodFormat, requestPeriodLogPeriodServicePeriodOutput=$requestPeriodLogPeriodServicePeriodOutput, requestPeriodLogPeriodServicePeriodOutputtype=$requestPeriodLogPeriodServicePeriodOutputtype, requestPeriodLogPeriodServicePeriodOnentry=$requestPeriodLogPeriodServicePeriodOnentry]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.requestPeriodLogPeriodServicePeriodFormat != null) {
      json[r'request.log.service.format'] = this.requestPeriodLogPeriodServicePeriodFormat;
    } else {
      json[r'request.log.service.format'] = null;
    }
    if (this.requestPeriodLogPeriodServicePeriodOutput != null) {
      json[r'request.log.service.output'] = this.requestPeriodLogPeriodServicePeriodOutput;
    } else {
      json[r'request.log.service.output'] = null;
    }
    if (this.requestPeriodLogPeriodServicePeriodOutputtype != null) {
      json[r'request.log.service.outputtype'] = this.requestPeriodLogPeriodServicePeriodOutputtype;
    } else {
      json[r'request.log.service.outputtype'] = null;
    }
    if (this.requestPeriodLogPeriodServicePeriodOnentry != null) {
      json[r'request.log.service.onentry'] = this.requestPeriodLogPeriodServicePeriodOnentry;
    } else {
      json[r'request.log.service.onentry'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEngineImplLogRequestLoggerServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEngineImplLogRequestLoggerServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(
        requestPeriodLogPeriodServicePeriodFormat: ConfigNodePropertyString.fromJson(json[r'request.log.service.format']),
        requestPeriodLogPeriodServicePeriodOutput: ConfigNodePropertyString.fromJson(json[r'request.log.service.output']),
        requestPeriodLogPeriodServicePeriodOutputtype: ConfigNodePropertyDropDown.fromJson(json[r'request.log.service.outputtype']),
        requestPeriodLogPeriodServicePeriodOnentry: ConfigNodePropertyBoolean.fromJson(json[r'request.log.service.onentry']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEngineImplLogRequestLoggerServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEngineImplLogRequestLoggerServiceProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEngineImplLogRequestLoggerServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEngineImplLogRequestLoggerServiceProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

