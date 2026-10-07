//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmFoundationFormsImplFormChooserServletProperties {
  /// Returns a new [ComDayCqWcmFoundationFormsImplFormChooserServletProperties] instance.
  ComDayCqWcmFoundationFormsImplFormChooserServletProperties({
    this.servicePeriodName,
    this.slingPeriodServletPeriodResourceTypes,
    this.slingPeriodServletPeriodSelectors,
    this.slingPeriodServletPeriodMethods,
    this.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? servicePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodResourceTypes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodServletPeriodSelectors;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? slingPeriodServletPeriodMethods;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmFoundationFormsImplFormChooserServletProperties &&
    other.servicePeriodName == servicePeriodName &&
    other.slingPeriodServletPeriodResourceTypes == slingPeriodServletPeriodResourceTypes &&
    other.slingPeriodServletPeriodSelectors == slingPeriodServletPeriodSelectors &&
    other.slingPeriodServletPeriodMethods == slingPeriodServletPeriodMethods &&
    other.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire == formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicePeriodName == null ? 0 : servicePeriodName!.hashCode) +
    (slingPeriodServletPeriodResourceTypes == null ? 0 : slingPeriodServletPeriodResourceTypes!.hashCode) +
    (slingPeriodServletPeriodSelectors == null ? 0 : slingPeriodServletPeriodSelectors!.hashCode) +
    (slingPeriodServletPeriodMethods == null ? 0 : slingPeriodServletPeriodMethods!.hashCode) +
    (formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire == null ? 0 : formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire!.hashCode);

  @override
  String toString() => 'ComDayCqWcmFoundationFormsImplFormChooserServletProperties[servicePeriodName=$servicePeriodName, slingPeriodServletPeriodResourceTypes=$slingPeriodServletPeriodResourceTypes, slingPeriodServletPeriodSelectors=$slingPeriodServletPeriodSelectors, slingPeriodServletPeriodMethods=$slingPeriodServletPeriodMethods, formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire=$formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicePeriodName != null) {
      json[r'service.name'] = this.servicePeriodName;
    } else {
      json[r'service.name'] = null;
    }
    if (this.slingPeriodServletPeriodResourceTypes != null) {
      json[r'sling.servlet.resourceTypes'] = this.slingPeriodServletPeriodResourceTypes;
    } else {
      json[r'sling.servlet.resourceTypes'] = null;
    }
    if (this.slingPeriodServletPeriodSelectors != null) {
      json[r'sling.servlet.selectors'] = this.slingPeriodServletPeriodSelectors;
    } else {
      json[r'sling.servlet.selectors'] = null;
    }
    if (this.slingPeriodServletPeriodMethods != null) {
      json[r'sling.servlet.methods'] = this.slingPeriodServletPeriodMethods;
    } else {
      json[r'sling.servlet.methods'] = null;
    }
    if (this.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire != null) {
      json[r'forms.formchooserservlet.advansesearch.require'] = this.formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire;
    } else {
      json[r'forms.formchooserservlet.advansesearch.require'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmFoundationFormsImplFormChooserServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmFoundationFormsImplFormChooserServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmFoundationFormsImplFormChooserServletProperties(
        servicePeriodName: ConfigNodePropertyString.fromJson(json[r'service.name']),
        slingPeriodServletPeriodResourceTypes: ConfigNodePropertyString.fromJson(json[r'sling.servlet.resourceTypes']),
        slingPeriodServletPeriodSelectors: ConfigNodePropertyString.fromJson(json[r'sling.servlet.selectors']),
        slingPeriodServletPeriodMethods: ConfigNodePropertyArray.fromJson(json[r'sling.servlet.methods']),
        formsPeriodFormchooserservletPeriodAdvansesearchPeriodRequire: ConfigNodePropertyBoolean.fromJson(json[r'forms.formchooserservlet.advansesearch.require']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmFoundationFormsImplFormChooserServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmFoundationFormsImplFormChooserServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmFoundationFormsImplFormChooserServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmFoundationFormsImplFormChooserServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmFoundationFormsImplFormChooserServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmFoundationFormsImplFormChooserServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmFoundationFormsImplFormChooserServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmFoundationFormsImplFormChooserServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmFoundationFormsImplFormChooserServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmFoundationFormsImplFormChooserServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

