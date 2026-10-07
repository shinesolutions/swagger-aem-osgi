//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEngineImplLogRequestLoggerProperties {
  /// Returns a new [OrgApacheSlingEngineImplLogRequestLoggerProperties] instance.
  OrgApacheSlingEngineImplLogRequestLoggerProperties({
    this.requestPeriodLogPeriodOutput,
    this.requestPeriodLogPeriodOutputtype,
    this.requestPeriodLogPeriodEnabled,
    this.accessPeriodLogPeriodOutput,
    this.accessPeriodLogPeriodOutputtype,
    this.accessPeriodLogPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? requestPeriodLogPeriodOutput;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? requestPeriodLogPeriodOutputtype;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? requestPeriodLogPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? accessPeriodLogPeriodOutput;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? accessPeriodLogPeriodOutputtype;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? accessPeriodLogPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEngineImplLogRequestLoggerProperties &&
    other.requestPeriodLogPeriodOutput == requestPeriodLogPeriodOutput &&
    other.requestPeriodLogPeriodOutputtype == requestPeriodLogPeriodOutputtype &&
    other.requestPeriodLogPeriodEnabled == requestPeriodLogPeriodEnabled &&
    other.accessPeriodLogPeriodOutput == accessPeriodLogPeriodOutput &&
    other.accessPeriodLogPeriodOutputtype == accessPeriodLogPeriodOutputtype &&
    other.accessPeriodLogPeriodEnabled == accessPeriodLogPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (requestPeriodLogPeriodOutput == null ? 0 : requestPeriodLogPeriodOutput!.hashCode) +
    (requestPeriodLogPeriodOutputtype == null ? 0 : requestPeriodLogPeriodOutputtype!.hashCode) +
    (requestPeriodLogPeriodEnabled == null ? 0 : requestPeriodLogPeriodEnabled!.hashCode) +
    (accessPeriodLogPeriodOutput == null ? 0 : accessPeriodLogPeriodOutput!.hashCode) +
    (accessPeriodLogPeriodOutputtype == null ? 0 : accessPeriodLogPeriodOutputtype!.hashCode) +
    (accessPeriodLogPeriodEnabled == null ? 0 : accessPeriodLogPeriodEnabled!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEngineImplLogRequestLoggerProperties[requestPeriodLogPeriodOutput=$requestPeriodLogPeriodOutput, requestPeriodLogPeriodOutputtype=$requestPeriodLogPeriodOutputtype, requestPeriodLogPeriodEnabled=$requestPeriodLogPeriodEnabled, accessPeriodLogPeriodOutput=$accessPeriodLogPeriodOutput, accessPeriodLogPeriodOutputtype=$accessPeriodLogPeriodOutputtype, accessPeriodLogPeriodEnabled=$accessPeriodLogPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.requestPeriodLogPeriodOutput != null) {
      json[r'request.log.output'] = this.requestPeriodLogPeriodOutput;
    } else {
      json[r'request.log.output'] = null;
    }
    if (this.requestPeriodLogPeriodOutputtype != null) {
      json[r'request.log.outputtype'] = this.requestPeriodLogPeriodOutputtype;
    } else {
      json[r'request.log.outputtype'] = null;
    }
    if (this.requestPeriodLogPeriodEnabled != null) {
      json[r'request.log.enabled'] = this.requestPeriodLogPeriodEnabled;
    } else {
      json[r'request.log.enabled'] = null;
    }
    if (this.accessPeriodLogPeriodOutput != null) {
      json[r'access.log.output'] = this.accessPeriodLogPeriodOutput;
    } else {
      json[r'access.log.output'] = null;
    }
    if (this.accessPeriodLogPeriodOutputtype != null) {
      json[r'access.log.outputtype'] = this.accessPeriodLogPeriodOutputtype;
    } else {
      json[r'access.log.outputtype'] = null;
    }
    if (this.accessPeriodLogPeriodEnabled != null) {
      json[r'access.log.enabled'] = this.accessPeriodLogPeriodEnabled;
    } else {
      json[r'access.log.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEngineImplLogRequestLoggerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEngineImplLogRequestLoggerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEngineImplLogRequestLoggerProperties(
        requestPeriodLogPeriodOutput: ConfigNodePropertyString.fromJson(json[r'request.log.output']),
        requestPeriodLogPeriodOutputtype: ConfigNodePropertyDropDown.fromJson(json[r'request.log.outputtype']),
        requestPeriodLogPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'request.log.enabled']),
        accessPeriodLogPeriodOutput: ConfigNodePropertyString.fromJson(json[r'access.log.output']),
        accessPeriodLogPeriodOutputtype: ConfigNodePropertyDropDown.fromJson(json[r'access.log.outputtype']),
        accessPeriodLogPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'access.log.enabled']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEngineImplLogRequestLoggerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEngineImplLogRequestLoggerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEngineImplLogRequestLoggerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEngineImplLogRequestLoggerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEngineImplLogRequestLoggerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEngineImplLogRequestLoggerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEngineImplLogRequestLoggerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEngineImplLogRequestLoggerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEngineImplLogRequestLoggerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEngineImplLogRequestLoggerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

