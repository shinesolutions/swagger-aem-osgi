//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {
  /// Returns a new [OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties] instance.
  OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties({
    this.javaPeriodClassdebuginfo,
    this.javaPeriodJavaEncoding,
    this.javaPeriodCompilerSourceVM,
    this.javaPeriodCompilerTargetVM,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? javaPeriodClassdebuginfo;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? javaPeriodJavaEncoding;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? javaPeriodCompilerSourceVM;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? javaPeriodCompilerTargetVM;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties &&
    other.javaPeriodClassdebuginfo == javaPeriodClassdebuginfo &&
    other.javaPeriodJavaEncoding == javaPeriodJavaEncoding &&
    other.javaPeriodCompilerSourceVM == javaPeriodCompilerSourceVM &&
    other.javaPeriodCompilerTargetVM == javaPeriodCompilerTargetVM;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (javaPeriodClassdebuginfo == null ? 0 : javaPeriodClassdebuginfo!.hashCode) +
    (javaPeriodJavaEncoding == null ? 0 : javaPeriodJavaEncoding!.hashCode) +
    (javaPeriodCompilerSourceVM == null ? 0 : javaPeriodCompilerSourceVM!.hashCode) +
    (javaPeriodCompilerTargetVM == null ? 0 : javaPeriodCompilerTargetVM!.hashCode);

  @override
  String toString() => 'OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties[javaPeriodClassdebuginfo=$javaPeriodClassdebuginfo, javaPeriodJavaEncoding=$javaPeriodJavaEncoding, javaPeriodCompilerSourceVM=$javaPeriodCompilerSourceVM, javaPeriodCompilerTargetVM=$javaPeriodCompilerTargetVM]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.javaPeriodClassdebuginfo != null) {
      json[r'java.classdebuginfo'] = this.javaPeriodClassdebuginfo;
    } else {
      json[r'java.classdebuginfo'] = null;
    }
    if (this.javaPeriodJavaEncoding != null) {
      json[r'java.javaEncoding'] = this.javaPeriodJavaEncoding;
    } else {
      json[r'java.javaEncoding'] = null;
    }
    if (this.javaPeriodCompilerSourceVM != null) {
      json[r'java.compilerSourceVM'] = this.javaPeriodCompilerSourceVM;
    } else {
      json[r'java.compilerSourceVM'] = null;
    }
    if (this.javaPeriodCompilerTargetVM != null) {
      json[r'java.compilerTargetVM'] = this.javaPeriodCompilerTargetVM;
    } else {
      json[r'java.compilerTargetVM'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(
        javaPeriodClassdebuginfo: ConfigNodePropertyBoolean.fromJson(json[r'java.classdebuginfo']),
        javaPeriodJavaEncoding: ConfigNodePropertyString.fromJson(json[r'java.javaEncoding']),
        javaPeriodCompilerSourceVM: ConfigNodePropertyString.fromJson(json[r'java.compilerSourceVM']),
        javaPeriodCompilerTargetVM: ConfigNodePropertyString.fromJson(json[r'java.compilerTargetVM']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

