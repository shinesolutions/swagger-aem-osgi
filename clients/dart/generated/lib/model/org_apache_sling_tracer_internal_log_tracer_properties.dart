//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingTracerInternalLogTracerProperties {
  /// Returns a new [OrgApacheSlingTracerInternalLogTracerProperties] instance.
  OrgApacheSlingTracerInternalLogTracerProperties({
    this.tracerSets,
    this.enabled,
    this.servletEnabled,
    this.recordingCacheSizeInMB,
    this.recordingCacheDurationInSecs,
    this.recordingCompressionEnabled,
    this.gzipResponse,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? tracerSets;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? servletEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? recordingCacheSizeInMB;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? recordingCacheDurationInSecs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? recordingCompressionEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? gzipResponse;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingTracerInternalLogTracerProperties &&
    other.tracerSets == tracerSets &&
    other.enabled == enabled &&
    other.servletEnabled == servletEnabled &&
    other.recordingCacheSizeInMB == recordingCacheSizeInMB &&
    other.recordingCacheDurationInSecs == recordingCacheDurationInSecs &&
    other.recordingCompressionEnabled == recordingCompressionEnabled &&
    other.gzipResponse == gzipResponse;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (tracerSets == null ? 0 : tracerSets!.hashCode) +
    (enabled == null ? 0 : enabled!.hashCode) +
    (servletEnabled == null ? 0 : servletEnabled!.hashCode) +
    (recordingCacheSizeInMB == null ? 0 : recordingCacheSizeInMB!.hashCode) +
    (recordingCacheDurationInSecs == null ? 0 : recordingCacheDurationInSecs!.hashCode) +
    (recordingCompressionEnabled == null ? 0 : recordingCompressionEnabled!.hashCode) +
    (gzipResponse == null ? 0 : gzipResponse!.hashCode);

  @override
  String toString() => 'OrgApacheSlingTracerInternalLogTracerProperties[tracerSets=$tracerSets, enabled=$enabled, servletEnabled=$servletEnabled, recordingCacheSizeInMB=$recordingCacheSizeInMB, recordingCacheDurationInSecs=$recordingCacheDurationInSecs, recordingCompressionEnabled=$recordingCompressionEnabled, gzipResponse=$gzipResponse]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.tracerSets != null) {
      json[r'tracerSets'] = this.tracerSets;
    } else {
      json[r'tracerSets'] = null;
    }
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.servletEnabled != null) {
      json[r'servletEnabled'] = this.servletEnabled;
    } else {
      json[r'servletEnabled'] = null;
    }
    if (this.recordingCacheSizeInMB != null) {
      json[r'recordingCacheSizeInMB'] = this.recordingCacheSizeInMB;
    } else {
      json[r'recordingCacheSizeInMB'] = null;
    }
    if (this.recordingCacheDurationInSecs != null) {
      json[r'recordingCacheDurationInSecs'] = this.recordingCacheDurationInSecs;
    } else {
      json[r'recordingCacheDurationInSecs'] = null;
    }
    if (this.recordingCompressionEnabled != null) {
      json[r'recordingCompressionEnabled'] = this.recordingCompressionEnabled;
    } else {
      json[r'recordingCompressionEnabled'] = null;
    }
    if (this.gzipResponse != null) {
      json[r'gzipResponse'] = this.gzipResponse;
    } else {
      json[r'gzipResponse'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingTracerInternalLogTracerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingTracerInternalLogTracerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingTracerInternalLogTracerProperties(
        tracerSets: ConfigNodePropertyArray.fromJson(json[r'tracerSets']),
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        servletEnabled: ConfigNodePropertyBoolean.fromJson(json[r'servletEnabled']),
        recordingCacheSizeInMB: ConfigNodePropertyInteger.fromJson(json[r'recordingCacheSizeInMB']),
        recordingCacheDurationInSecs: ConfigNodePropertyInteger.fromJson(json[r'recordingCacheDurationInSecs']),
        recordingCompressionEnabled: ConfigNodePropertyBoolean.fromJson(json[r'recordingCompressionEnabled']),
        gzipResponse: ConfigNodePropertyBoolean.fromJson(json[r'gzipResponse']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingTracerInternalLogTracerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingTracerInternalLogTracerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingTracerInternalLogTracerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingTracerInternalLogTracerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingTracerInternalLogTracerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingTracerInternalLogTracerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingTracerInternalLogTracerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingTracerInternalLogTracerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingTracerInternalLogTracerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingTracerInternalLogTracerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

