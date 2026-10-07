//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {
  /// Returns a new [ComAdobeCqDamCfmImplComponentComponentConfigImplProperties] instance.
  ComAdobeCqDamCfmImplComponentComponentConfigImplProperties({
    this.damPeriodCfmPeriodComponentPeriodResourceType,
    this.damPeriodCfmPeriodComponentPeriodFileReferenceProp,
    this.damPeriodCfmPeriodComponentPeriodElementsProp,
    this.damPeriodCfmPeriodComponentPeriodVariationProp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? damPeriodCfmPeriodComponentPeriodResourceType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? damPeriodCfmPeriodComponentPeriodFileReferenceProp;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? damPeriodCfmPeriodComponentPeriodElementsProp;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? damPeriodCfmPeriodComponentPeriodVariationProp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamCfmImplComponentComponentConfigImplProperties &&
    other.damPeriodCfmPeriodComponentPeriodResourceType == damPeriodCfmPeriodComponentPeriodResourceType &&
    other.damPeriodCfmPeriodComponentPeriodFileReferenceProp == damPeriodCfmPeriodComponentPeriodFileReferenceProp &&
    other.damPeriodCfmPeriodComponentPeriodElementsProp == damPeriodCfmPeriodComponentPeriodElementsProp &&
    other.damPeriodCfmPeriodComponentPeriodVariationProp == damPeriodCfmPeriodComponentPeriodVariationProp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (damPeriodCfmPeriodComponentPeriodResourceType == null ? 0 : damPeriodCfmPeriodComponentPeriodResourceType!.hashCode) +
    (damPeriodCfmPeriodComponentPeriodFileReferenceProp == null ? 0 : damPeriodCfmPeriodComponentPeriodFileReferenceProp!.hashCode) +
    (damPeriodCfmPeriodComponentPeriodElementsProp == null ? 0 : damPeriodCfmPeriodComponentPeriodElementsProp!.hashCode) +
    (damPeriodCfmPeriodComponentPeriodVariationProp == null ? 0 : damPeriodCfmPeriodComponentPeriodVariationProp!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamCfmImplComponentComponentConfigImplProperties[damPeriodCfmPeriodComponentPeriodResourceType=$damPeriodCfmPeriodComponentPeriodResourceType, damPeriodCfmPeriodComponentPeriodFileReferenceProp=$damPeriodCfmPeriodComponentPeriodFileReferenceProp, damPeriodCfmPeriodComponentPeriodElementsProp=$damPeriodCfmPeriodComponentPeriodElementsProp, damPeriodCfmPeriodComponentPeriodVariationProp=$damPeriodCfmPeriodComponentPeriodVariationProp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.damPeriodCfmPeriodComponentPeriodResourceType != null) {
      json[r'dam.cfm.component.resourceType'] = this.damPeriodCfmPeriodComponentPeriodResourceType;
    } else {
      json[r'dam.cfm.component.resourceType'] = null;
    }
    if (this.damPeriodCfmPeriodComponentPeriodFileReferenceProp != null) {
      json[r'dam.cfm.component.fileReferenceProp'] = this.damPeriodCfmPeriodComponentPeriodFileReferenceProp;
    } else {
      json[r'dam.cfm.component.fileReferenceProp'] = null;
    }
    if (this.damPeriodCfmPeriodComponentPeriodElementsProp != null) {
      json[r'dam.cfm.component.elementsProp'] = this.damPeriodCfmPeriodComponentPeriodElementsProp;
    } else {
      json[r'dam.cfm.component.elementsProp'] = null;
    }
    if (this.damPeriodCfmPeriodComponentPeriodVariationProp != null) {
      json[r'dam.cfm.component.variationProp'] = this.damPeriodCfmPeriodComponentPeriodVariationProp;
    } else {
      json[r'dam.cfm.component.variationProp'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamCfmImplComponentComponentConfigImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamCfmImplComponentComponentConfigImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(
        damPeriodCfmPeriodComponentPeriodResourceType: ConfigNodePropertyString.fromJson(json[r'dam.cfm.component.resourceType']),
        damPeriodCfmPeriodComponentPeriodFileReferenceProp: ConfigNodePropertyString.fromJson(json[r'dam.cfm.component.fileReferenceProp']),
        damPeriodCfmPeriodComponentPeriodElementsProp: ConfigNodePropertyString.fromJson(json[r'dam.cfm.component.elementsProp']),
        damPeriodCfmPeriodComponentPeriodVariationProp: ConfigNodePropertyString.fromJson(json[r'dam.cfm.component.variationProp']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamCfmImplComponentComponentConfigImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamCfmImplComponentComponentConfigImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamCfmImplComponentComponentConfigImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamCfmImplComponentComponentConfigImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

