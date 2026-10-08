//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamIdsImplIDSJobProcessorProperties {
  /// Returns a new [ComDayCqDamIdsImplIDSJobProcessorProperties] instance.
  ComDayCqDamIdsImplIDSJobProcessorProperties({
    this.enablePeriodMultisession,
    this.idsPeriodCcPeriodEnable,
    this.enablePeriodRetry,
    this.enablePeriodRetryPeriodScripterror,
    this.externalizerPeriodDomainPeriodCqhost,
    this.externalizerPeriodDomainPeriodHttp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodMultisession;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? idsPeriodCcPeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodRetry;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodRetryPeriodScripterror;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? externalizerPeriodDomainPeriodCqhost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? externalizerPeriodDomainPeriodHttp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamIdsImplIDSJobProcessorProperties &&
    other.enablePeriodMultisession == enablePeriodMultisession &&
    other.idsPeriodCcPeriodEnable == idsPeriodCcPeriodEnable &&
    other.enablePeriodRetry == enablePeriodRetry &&
    other.enablePeriodRetryPeriodScripterror == enablePeriodRetryPeriodScripterror &&
    other.externalizerPeriodDomainPeriodCqhost == externalizerPeriodDomainPeriodCqhost &&
    other.externalizerPeriodDomainPeriodHttp == externalizerPeriodDomainPeriodHttp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enablePeriodMultisession == null ? 0 : enablePeriodMultisession!.hashCode) +
    (idsPeriodCcPeriodEnable == null ? 0 : idsPeriodCcPeriodEnable!.hashCode) +
    (enablePeriodRetry == null ? 0 : enablePeriodRetry!.hashCode) +
    (enablePeriodRetryPeriodScripterror == null ? 0 : enablePeriodRetryPeriodScripterror!.hashCode) +
    (externalizerPeriodDomainPeriodCqhost == null ? 0 : externalizerPeriodDomainPeriodCqhost!.hashCode) +
    (externalizerPeriodDomainPeriodHttp == null ? 0 : externalizerPeriodDomainPeriodHttp!.hashCode);

  @override
  String toString() => 'ComDayCqDamIdsImplIDSJobProcessorProperties[enablePeriodMultisession=$enablePeriodMultisession, idsPeriodCcPeriodEnable=$idsPeriodCcPeriodEnable, enablePeriodRetry=$enablePeriodRetry, enablePeriodRetryPeriodScripterror=$enablePeriodRetryPeriodScripterror, externalizerPeriodDomainPeriodCqhost=$externalizerPeriodDomainPeriodCqhost, externalizerPeriodDomainPeriodHttp=$externalizerPeriodDomainPeriodHttp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enablePeriodMultisession != null) {
      json[r'enable.multisession'] = this.enablePeriodMultisession;
    } else {
      json[r'enable.multisession'] = null;
    }
    if (this.idsPeriodCcPeriodEnable != null) {
      json[r'ids.cc.enable'] = this.idsPeriodCcPeriodEnable;
    } else {
      json[r'ids.cc.enable'] = null;
    }
    if (this.enablePeriodRetry != null) {
      json[r'enable.retry'] = this.enablePeriodRetry;
    } else {
      json[r'enable.retry'] = null;
    }
    if (this.enablePeriodRetryPeriodScripterror != null) {
      json[r'enable.retry.scripterror'] = this.enablePeriodRetryPeriodScripterror;
    } else {
      json[r'enable.retry.scripterror'] = null;
    }
    if (this.externalizerPeriodDomainPeriodCqhost != null) {
      json[r'externalizer.domain.cqhost'] = this.externalizerPeriodDomainPeriodCqhost;
    } else {
      json[r'externalizer.domain.cqhost'] = null;
    }
    if (this.externalizerPeriodDomainPeriodHttp != null) {
      json[r'externalizer.domain.http'] = this.externalizerPeriodDomainPeriodHttp;
    } else {
      json[r'externalizer.domain.http'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamIdsImplIDSJobProcessorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamIdsImplIDSJobProcessorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamIdsImplIDSJobProcessorProperties(
        enablePeriodMultisession: ConfigNodePropertyBoolean.fromJson(json[r'enable.multisession']),
        idsPeriodCcPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'ids.cc.enable']),
        enablePeriodRetry: ConfigNodePropertyBoolean.fromJson(json[r'enable.retry']),
        enablePeriodRetryPeriodScripterror: ConfigNodePropertyBoolean.fromJson(json[r'enable.retry.scripterror']),
        externalizerPeriodDomainPeriodCqhost: ConfigNodePropertyString.fromJson(json[r'externalizer.domain.cqhost']),
        externalizerPeriodDomainPeriodHttp: ConfigNodePropertyString.fromJson(json[r'externalizer.domain.http']),
      );
    }
    return null;
  }

  static List<ComDayCqDamIdsImplIDSJobProcessorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamIdsImplIDSJobProcessorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamIdsImplIDSJobProcessorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamIdsImplIDSJobProcessorProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamIdsImplIDSJobProcessorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamIdsImplIDSJobProcessorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamIdsImplIDSJobProcessorProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamIdsImplIDSJobProcessorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamIdsImplIDSJobProcessorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamIdsImplIDSJobProcessorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

