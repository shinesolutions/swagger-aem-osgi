//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEngineParametersProperties {
  /// Returns a new [OrgApacheSlingEngineParametersProperties] instance.
  OrgApacheSlingEngineParametersProperties({
    this.slingPeriodDefaultPeriodParameterPeriodEncoding,
    this.slingPeriodDefaultPeriodMaxPeriodParameters,
    this.filePeriodLocation,
    this.filePeriodThreshold,
    this.filePeriodMax,
    this.requestPeriodMax,
    this.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodDefaultPeriodParameterPeriodEncoding;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? slingPeriodDefaultPeriodMaxPeriodParameters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? filePeriodLocation;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? filePeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? filePeriodMax;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? requestPeriodMax;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEngineParametersProperties &&
    other.slingPeriodDefaultPeriodParameterPeriodEncoding == slingPeriodDefaultPeriodParameterPeriodEncoding &&
    other.slingPeriodDefaultPeriodMaxPeriodParameters == slingPeriodDefaultPeriodMaxPeriodParameters &&
    other.filePeriodLocation == filePeriodLocation &&
    other.filePeriodThreshold == filePeriodThreshold &&
    other.filePeriodMax == filePeriodMax &&
    other.requestPeriodMax == requestPeriodMax &&
    other.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters == slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodDefaultPeriodParameterPeriodEncoding == null ? 0 : slingPeriodDefaultPeriodParameterPeriodEncoding!.hashCode) +
    (slingPeriodDefaultPeriodMaxPeriodParameters == null ? 0 : slingPeriodDefaultPeriodMaxPeriodParameters!.hashCode) +
    (filePeriodLocation == null ? 0 : filePeriodLocation!.hashCode) +
    (filePeriodThreshold == null ? 0 : filePeriodThreshold!.hashCode) +
    (filePeriodMax == null ? 0 : filePeriodMax!.hashCode) +
    (requestPeriodMax == null ? 0 : requestPeriodMax!.hashCode) +
    (slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters == null ? 0 : slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEngineParametersProperties[slingPeriodDefaultPeriodParameterPeriodEncoding=$slingPeriodDefaultPeriodParameterPeriodEncoding, slingPeriodDefaultPeriodMaxPeriodParameters=$slingPeriodDefaultPeriodMaxPeriodParameters, filePeriodLocation=$filePeriodLocation, filePeriodThreshold=$filePeriodThreshold, filePeriodMax=$filePeriodMax, requestPeriodMax=$requestPeriodMax, slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters=$slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodDefaultPeriodParameterPeriodEncoding != null) {
      json[r'sling.default.parameter.encoding'] = this.slingPeriodDefaultPeriodParameterPeriodEncoding;
    } else {
      json[r'sling.default.parameter.encoding'] = null;
    }
    if (this.slingPeriodDefaultPeriodMaxPeriodParameters != null) {
      json[r'sling.default.max.parameters'] = this.slingPeriodDefaultPeriodMaxPeriodParameters;
    } else {
      json[r'sling.default.max.parameters'] = null;
    }
    if (this.filePeriodLocation != null) {
      json[r'file.location'] = this.filePeriodLocation;
    } else {
      json[r'file.location'] = null;
    }
    if (this.filePeriodThreshold != null) {
      json[r'file.threshold'] = this.filePeriodThreshold;
    } else {
      json[r'file.threshold'] = null;
    }
    if (this.filePeriodMax != null) {
      json[r'file.max'] = this.filePeriodMax;
    } else {
      json[r'file.max'] = null;
    }
    if (this.requestPeriodMax != null) {
      json[r'request.max'] = this.requestPeriodMax;
    } else {
      json[r'request.max'] = null;
    }
    if (this.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters != null) {
      json[r'sling.default.parameter.checkForAdditionalContainerParameters'] = this.slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters;
    } else {
      json[r'sling.default.parameter.checkForAdditionalContainerParameters'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEngineParametersProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEngineParametersProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEngineParametersProperties(
        slingPeriodDefaultPeriodParameterPeriodEncoding: ConfigNodePropertyString.fromJson(json[r'sling.default.parameter.encoding']),
        slingPeriodDefaultPeriodMaxPeriodParameters: ConfigNodePropertyInteger.fromJson(json[r'sling.default.max.parameters']),
        filePeriodLocation: ConfigNodePropertyString.fromJson(json[r'file.location']),
        filePeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'file.threshold']),
        filePeriodMax: ConfigNodePropertyInteger.fromJson(json[r'file.max']),
        requestPeriodMax: ConfigNodePropertyInteger.fromJson(json[r'request.max']),
        slingPeriodDefaultPeriodParameterPeriodCheckForAdditionalContainerParameters: ConfigNodePropertyBoolean.fromJson(json[r'sling.default.parameter.checkForAdditionalContainerParameters']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEngineParametersProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEngineParametersProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEngineParametersProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEngineParametersProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEngineParametersProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEngineParametersProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEngineParametersProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEngineParametersProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEngineParametersProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEngineParametersProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

