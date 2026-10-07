//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqAuthImplLoginSelectorHandlerProperties {
  /// Returns a new [ComDayCqAuthImplLoginSelectorHandlerProperties] instance.
  ComDayCqAuthImplLoginSelectorHandlerProperties({
    this.path,
    this.servicePeriodRanking,
    this.authPeriodLoginselectorPeriodMappings,
    this.authPeriodLoginselectorPeriodChangepwPeriodMappings,
    this.authPeriodLoginselectorPeriodDefaultloginpage,
    this.authPeriodLoginselectorPeriodDefaultchangepwpage,
    this.authPeriodLoginselectorPeriodHandle,
    this.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? authPeriodLoginselectorPeriodMappings;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? authPeriodLoginselectorPeriodChangepwPeriodMappings;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? authPeriodLoginselectorPeriodDefaultloginpage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? authPeriodLoginselectorPeriodDefaultchangepwpage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? authPeriodLoginselectorPeriodHandle;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqAuthImplLoginSelectorHandlerProperties &&
    other.path == path &&
    other.servicePeriodRanking == servicePeriodRanking &&
    other.authPeriodLoginselectorPeriodMappings == authPeriodLoginselectorPeriodMappings &&
    other.authPeriodLoginselectorPeriodChangepwPeriodMappings == authPeriodLoginselectorPeriodChangepwPeriodMappings &&
    other.authPeriodLoginselectorPeriodDefaultloginpage == authPeriodLoginselectorPeriodDefaultloginpage &&
    other.authPeriodLoginselectorPeriodDefaultchangepwpage == authPeriodLoginselectorPeriodDefaultchangepwpage &&
    other.authPeriodLoginselectorPeriodHandle == authPeriodLoginselectorPeriodHandle &&
    other.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions == authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode) +
    (authPeriodLoginselectorPeriodMappings == null ? 0 : authPeriodLoginselectorPeriodMappings!.hashCode) +
    (authPeriodLoginselectorPeriodChangepwPeriodMappings == null ? 0 : authPeriodLoginselectorPeriodChangepwPeriodMappings!.hashCode) +
    (authPeriodLoginselectorPeriodDefaultloginpage == null ? 0 : authPeriodLoginselectorPeriodDefaultloginpage!.hashCode) +
    (authPeriodLoginselectorPeriodDefaultchangepwpage == null ? 0 : authPeriodLoginselectorPeriodDefaultchangepwpage!.hashCode) +
    (authPeriodLoginselectorPeriodHandle == null ? 0 : authPeriodLoginselectorPeriodHandle!.hashCode) +
    (authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions == null ? 0 : authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions!.hashCode);

  @override
  String toString() => 'ComDayCqAuthImplLoginSelectorHandlerProperties[path=$path, servicePeriodRanking=$servicePeriodRanking, authPeriodLoginselectorPeriodMappings=$authPeriodLoginselectorPeriodMappings, authPeriodLoginselectorPeriodChangepwPeriodMappings=$authPeriodLoginselectorPeriodChangepwPeriodMappings, authPeriodLoginselectorPeriodDefaultloginpage=$authPeriodLoginselectorPeriodDefaultloginpage, authPeriodLoginselectorPeriodDefaultchangepwpage=$authPeriodLoginselectorPeriodDefaultchangepwpage, authPeriodLoginselectorPeriodHandle=$authPeriodLoginselectorPeriodHandle, authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions=$authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    if (this.authPeriodLoginselectorPeriodMappings != null) {
      json[r'auth.loginselector.mappings'] = this.authPeriodLoginselectorPeriodMappings;
    } else {
      json[r'auth.loginselector.mappings'] = null;
    }
    if (this.authPeriodLoginselectorPeriodChangepwPeriodMappings != null) {
      json[r'auth.loginselector.changepw.mappings'] = this.authPeriodLoginselectorPeriodChangepwPeriodMappings;
    } else {
      json[r'auth.loginselector.changepw.mappings'] = null;
    }
    if (this.authPeriodLoginselectorPeriodDefaultloginpage != null) {
      json[r'auth.loginselector.defaultloginpage'] = this.authPeriodLoginselectorPeriodDefaultloginpage;
    } else {
      json[r'auth.loginselector.defaultloginpage'] = null;
    }
    if (this.authPeriodLoginselectorPeriodDefaultchangepwpage != null) {
      json[r'auth.loginselector.defaultchangepwpage'] = this.authPeriodLoginselectorPeriodDefaultchangepwpage;
    } else {
      json[r'auth.loginselector.defaultchangepwpage'] = null;
    }
    if (this.authPeriodLoginselectorPeriodHandle != null) {
      json[r'auth.loginselector.handle'] = this.authPeriodLoginselectorPeriodHandle;
    } else {
      json[r'auth.loginselector.handle'] = null;
    }
    if (this.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions != null) {
      json[r'auth.loginselector.handle.all.extensions'] = this.authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions;
    } else {
      json[r'auth.loginselector.handle.all.extensions'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqAuthImplLoginSelectorHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqAuthImplLoginSelectorHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqAuthImplLoginSelectorHandlerProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
        authPeriodLoginselectorPeriodMappings: ConfigNodePropertyArray.fromJson(json[r'auth.loginselector.mappings']),
        authPeriodLoginselectorPeriodChangepwPeriodMappings: ConfigNodePropertyArray.fromJson(json[r'auth.loginselector.changepw.mappings']),
        authPeriodLoginselectorPeriodDefaultloginpage: ConfigNodePropertyString.fromJson(json[r'auth.loginselector.defaultloginpage']),
        authPeriodLoginselectorPeriodDefaultchangepwpage: ConfigNodePropertyString.fromJson(json[r'auth.loginselector.defaultchangepwpage']),
        authPeriodLoginselectorPeriodHandle: ConfigNodePropertyArray.fromJson(json[r'auth.loginselector.handle']),
        authPeriodLoginselectorPeriodHandlePeriodAllPeriodExtensions: ConfigNodePropertyBoolean.fromJson(json[r'auth.loginselector.handle.all.extensions']),
      );
    }
    return null;
  }

  static List<ComDayCqAuthImplLoginSelectorHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqAuthImplLoginSelectorHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqAuthImplLoginSelectorHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqAuthImplLoginSelectorHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqAuthImplLoginSelectorHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqAuthImplLoginSelectorHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqAuthImplLoginSelectorHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqAuthImplLoginSelectorHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqAuthImplLoginSelectorHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqAuthImplLoginSelectorHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

