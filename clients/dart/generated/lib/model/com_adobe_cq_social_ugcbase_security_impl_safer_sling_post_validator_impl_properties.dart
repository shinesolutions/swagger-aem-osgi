//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties] instance.
  ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties({
    this.parameterPeriodWhitelist,
    this.parameterPeriodWhitelistPeriodPrefixes,
    this.binaryPeriodParameterPeriodWhitelist,
    this.modifierPeriodWhitelist,
    this.operationPeriodWhitelist,
    this.operationPeriodWhitelistPeriodPrefixes,
    this.typehintPeriodWhitelist,
    this.resourcetypePeriodWhitelist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? parameterPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? parameterPeriodWhitelistPeriodPrefixes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? binaryPeriodParameterPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? modifierPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? operationPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? operationPeriodWhitelistPeriodPrefixes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? typehintPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? resourcetypePeriodWhitelist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties &&
    other.parameterPeriodWhitelist == parameterPeriodWhitelist &&
    other.parameterPeriodWhitelistPeriodPrefixes == parameterPeriodWhitelistPeriodPrefixes &&
    other.binaryPeriodParameterPeriodWhitelist == binaryPeriodParameterPeriodWhitelist &&
    other.modifierPeriodWhitelist == modifierPeriodWhitelist &&
    other.operationPeriodWhitelist == operationPeriodWhitelist &&
    other.operationPeriodWhitelistPeriodPrefixes == operationPeriodWhitelistPeriodPrefixes &&
    other.typehintPeriodWhitelist == typehintPeriodWhitelist &&
    other.resourcetypePeriodWhitelist == resourcetypePeriodWhitelist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (parameterPeriodWhitelist == null ? 0 : parameterPeriodWhitelist!.hashCode) +
    (parameterPeriodWhitelistPeriodPrefixes == null ? 0 : parameterPeriodWhitelistPeriodPrefixes!.hashCode) +
    (binaryPeriodParameterPeriodWhitelist == null ? 0 : binaryPeriodParameterPeriodWhitelist!.hashCode) +
    (modifierPeriodWhitelist == null ? 0 : modifierPeriodWhitelist!.hashCode) +
    (operationPeriodWhitelist == null ? 0 : operationPeriodWhitelist!.hashCode) +
    (operationPeriodWhitelistPeriodPrefixes == null ? 0 : operationPeriodWhitelistPeriodPrefixes!.hashCode) +
    (typehintPeriodWhitelist == null ? 0 : typehintPeriodWhitelist!.hashCode) +
    (resourcetypePeriodWhitelist == null ? 0 : resourcetypePeriodWhitelist!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties[parameterPeriodWhitelist=$parameterPeriodWhitelist, parameterPeriodWhitelistPeriodPrefixes=$parameterPeriodWhitelistPeriodPrefixes, binaryPeriodParameterPeriodWhitelist=$binaryPeriodParameterPeriodWhitelist, modifierPeriodWhitelist=$modifierPeriodWhitelist, operationPeriodWhitelist=$operationPeriodWhitelist, operationPeriodWhitelistPeriodPrefixes=$operationPeriodWhitelistPeriodPrefixes, typehintPeriodWhitelist=$typehintPeriodWhitelist, resourcetypePeriodWhitelist=$resourcetypePeriodWhitelist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.parameterPeriodWhitelist != null) {
      json[r'parameter.whitelist'] = this.parameterPeriodWhitelist;
    } else {
      json[r'parameter.whitelist'] = null;
    }
    if (this.parameterPeriodWhitelistPeriodPrefixes != null) {
      json[r'parameter.whitelist.prefixes'] = this.parameterPeriodWhitelistPeriodPrefixes;
    } else {
      json[r'parameter.whitelist.prefixes'] = null;
    }
    if (this.binaryPeriodParameterPeriodWhitelist != null) {
      json[r'binary.parameter.whitelist'] = this.binaryPeriodParameterPeriodWhitelist;
    } else {
      json[r'binary.parameter.whitelist'] = null;
    }
    if (this.modifierPeriodWhitelist != null) {
      json[r'modifier.whitelist'] = this.modifierPeriodWhitelist;
    } else {
      json[r'modifier.whitelist'] = null;
    }
    if (this.operationPeriodWhitelist != null) {
      json[r'operation.whitelist'] = this.operationPeriodWhitelist;
    } else {
      json[r'operation.whitelist'] = null;
    }
    if (this.operationPeriodWhitelistPeriodPrefixes != null) {
      json[r'operation.whitelist.prefixes'] = this.operationPeriodWhitelistPeriodPrefixes;
    } else {
      json[r'operation.whitelist.prefixes'] = null;
    }
    if (this.typehintPeriodWhitelist != null) {
      json[r'typehint.whitelist'] = this.typehintPeriodWhitelist;
    } else {
      json[r'typehint.whitelist'] = null;
    }
    if (this.resourcetypePeriodWhitelist != null) {
      json[r'resourcetype.whitelist'] = this.resourcetypePeriodWhitelist;
    } else {
      json[r'resourcetype.whitelist'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(
        parameterPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'parameter.whitelist']),
        parameterPeriodWhitelistPeriodPrefixes: ConfigNodePropertyArray.fromJson(json[r'parameter.whitelist.prefixes']),
        binaryPeriodParameterPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'binary.parameter.whitelist']),
        modifierPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'modifier.whitelist']),
        operationPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'operation.whitelist']),
        operationPeriodWhitelistPeriodPrefixes: ConfigNodePropertyArray.fromJson(json[r'operation.whitelist.prefixes']),
        typehintPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'typehint.whitelist']),
        resourcetypePeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'resourcetype.whitelist']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

