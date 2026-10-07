//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
  /// Returns a new [ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties] instance.
  ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties({
    this.scene7FlashTemplatesPeriodRti,
    this.scene7FlashTemplatesPeriodRsi,
    this.scene7FlashTemplatesPeriodRb,
    this.scene7FlashTemplatesPeriodRurl,
    this.scene7FlashTemplatePeriodUrlFormatParameter,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scene7FlashTemplatesPeriodRti;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scene7FlashTemplatesPeriodRsi;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scene7FlashTemplatesPeriodRb;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scene7FlashTemplatesPeriodRurl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scene7FlashTemplatePeriodUrlFormatParameter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties &&
    other.scene7FlashTemplatesPeriodRti == scene7FlashTemplatesPeriodRti &&
    other.scene7FlashTemplatesPeriodRsi == scene7FlashTemplatesPeriodRsi &&
    other.scene7FlashTemplatesPeriodRb == scene7FlashTemplatesPeriodRb &&
    other.scene7FlashTemplatesPeriodRurl == scene7FlashTemplatesPeriodRurl &&
    other.scene7FlashTemplatePeriodUrlFormatParameter == scene7FlashTemplatePeriodUrlFormatParameter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scene7FlashTemplatesPeriodRti == null ? 0 : scene7FlashTemplatesPeriodRti!.hashCode) +
    (scene7FlashTemplatesPeriodRsi == null ? 0 : scene7FlashTemplatesPeriodRsi!.hashCode) +
    (scene7FlashTemplatesPeriodRb == null ? 0 : scene7FlashTemplatesPeriodRb!.hashCode) +
    (scene7FlashTemplatesPeriodRurl == null ? 0 : scene7FlashTemplatesPeriodRurl!.hashCode) +
    (scene7FlashTemplatePeriodUrlFormatParameter == null ? 0 : scene7FlashTemplatePeriodUrlFormatParameter!.hashCode);

  @override
  String toString() => 'ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties[scene7FlashTemplatesPeriodRti=$scene7FlashTemplatesPeriodRti, scene7FlashTemplatesPeriodRsi=$scene7FlashTemplatesPeriodRsi, scene7FlashTemplatesPeriodRb=$scene7FlashTemplatesPeriodRb, scene7FlashTemplatesPeriodRurl=$scene7FlashTemplatesPeriodRurl, scene7FlashTemplatePeriodUrlFormatParameter=$scene7FlashTemplatePeriodUrlFormatParameter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.scene7FlashTemplatesPeriodRti != null) {
      json[r'scene7FlashTemplates.rti'] = this.scene7FlashTemplatesPeriodRti;
    } else {
      json[r'scene7FlashTemplates.rti'] = null;
    }
    if (this.scene7FlashTemplatesPeriodRsi != null) {
      json[r'scene7FlashTemplates.rsi'] = this.scene7FlashTemplatesPeriodRsi;
    } else {
      json[r'scene7FlashTemplates.rsi'] = null;
    }
    if (this.scene7FlashTemplatesPeriodRb != null) {
      json[r'scene7FlashTemplates.rb'] = this.scene7FlashTemplatesPeriodRb;
    } else {
      json[r'scene7FlashTemplates.rb'] = null;
    }
    if (this.scene7FlashTemplatesPeriodRurl != null) {
      json[r'scene7FlashTemplates.rurl'] = this.scene7FlashTemplatesPeriodRurl;
    } else {
      json[r'scene7FlashTemplates.rurl'] = null;
    }
    if (this.scene7FlashTemplatePeriodUrlFormatParameter != null) {
      json[r'scene7FlashTemplate.urlFormatParameter'] = this.scene7FlashTemplatePeriodUrlFormatParameter;
    } else {
      json[r'scene7FlashTemplate.urlFormatParameter'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(
        scene7FlashTemplatesPeriodRti: ConfigNodePropertyString.fromJson(json[r'scene7FlashTemplates.rti']),
        scene7FlashTemplatesPeriodRsi: ConfigNodePropertyString.fromJson(json[r'scene7FlashTemplates.rsi']),
        scene7FlashTemplatesPeriodRb: ConfigNodePropertyString.fromJson(json[r'scene7FlashTemplates.rb']),
        scene7FlashTemplatesPeriodRurl: ConfigNodePropertyString.fromJson(json[r'scene7FlashTemplates.rurl']),
        scene7FlashTemplatePeriodUrlFormatParameter: ConfigNodePropertyString.fromJson(json[r'scene7FlashTemplate.urlFormatParameter']),
      );
    }
    return null;
  }

  static List<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

