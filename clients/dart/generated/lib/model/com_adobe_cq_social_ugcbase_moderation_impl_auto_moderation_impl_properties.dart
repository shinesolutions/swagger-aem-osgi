//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {
  /// Returns a new [ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties] instance.
  ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties({
    this.automoderationPeriodSequence,
    this.automoderationPeriodOnfailurestop,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? automoderationPeriodSequence;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? automoderationPeriodOnfailurestop;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties &&
    other.automoderationPeriodSequence == automoderationPeriodSequence &&
    other.automoderationPeriodOnfailurestop == automoderationPeriodOnfailurestop;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (automoderationPeriodSequence == null ? 0 : automoderationPeriodSequence!.hashCode) +
    (automoderationPeriodOnfailurestop == null ? 0 : automoderationPeriodOnfailurestop!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties[automoderationPeriodSequence=$automoderationPeriodSequence, automoderationPeriodOnfailurestop=$automoderationPeriodOnfailurestop]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.automoderationPeriodSequence != null) {
      json[r'automoderation.sequence'] = this.automoderationPeriodSequence;
    } else {
      json[r'automoderation.sequence'] = null;
    }
    if (this.automoderationPeriodOnfailurestop != null) {
      json[r'automoderation.onfailurestop'] = this.automoderationPeriodOnfailurestop;
    } else {
      json[r'automoderation.onfailurestop'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(
        automoderationPeriodSequence: ConfigNodePropertyArray.fromJson(json[r'automoderation.sequence']),
        automoderationPeriodOnfailurestop: ConfigNodePropertyBoolean.fromJson(json[r'automoderation.onfailurestop']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

