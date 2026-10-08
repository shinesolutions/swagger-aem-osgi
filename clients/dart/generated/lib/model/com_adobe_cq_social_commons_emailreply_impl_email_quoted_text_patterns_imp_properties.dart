//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties] instance.
  ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties({
    this.patternPeriodTime,
    this.patternPeriodNewline,
    this.patternPeriodDayOfMonth,
    this.patternPeriodMonth,
    this.patternPeriodYear,
    this.patternPeriodDate,
    this.patternPeriodDateTime,
    this.patternPeriodEmail,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodNewline;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodDayOfMonth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodMonth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodYear;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodDateTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? patternPeriodEmail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties &&
    other.patternPeriodTime == patternPeriodTime &&
    other.patternPeriodNewline == patternPeriodNewline &&
    other.patternPeriodDayOfMonth == patternPeriodDayOfMonth &&
    other.patternPeriodMonth == patternPeriodMonth &&
    other.patternPeriodYear == patternPeriodYear &&
    other.patternPeriodDate == patternPeriodDate &&
    other.patternPeriodDateTime == patternPeriodDateTime &&
    other.patternPeriodEmail == patternPeriodEmail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (patternPeriodTime == null ? 0 : patternPeriodTime!.hashCode) +
    (patternPeriodNewline == null ? 0 : patternPeriodNewline!.hashCode) +
    (patternPeriodDayOfMonth == null ? 0 : patternPeriodDayOfMonth!.hashCode) +
    (patternPeriodMonth == null ? 0 : patternPeriodMonth!.hashCode) +
    (patternPeriodYear == null ? 0 : patternPeriodYear!.hashCode) +
    (patternPeriodDate == null ? 0 : patternPeriodDate!.hashCode) +
    (patternPeriodDateTime == null ? 0 : patternPeriodDateTime!.hashCode) +
    (patternPeriodEmail == null ? 0 : patternPeriodEmail!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties[patternPeriodTime=$patternPeriodTime, patternPeriodNewline=$patternPeriodNewline, patternPeriodDayOfMonth=$patternPeriodDayOfMonth, patternPeriodMonth=$patternPeriodMonth, patternPeriodYear=$patternPeriodYear, patternPeriodDate=$patternPeriodDate, patternPeriodDateTime=$patternPeriodDateTime, patternPeriodEmail=$patternPeriodEmail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.patternPeriodTime != null) {
      json[r'pattern.time'] = this.patternPeriodTime;
    } else {
      json[r'pattern.time'] = null;
    }
    if (this.patternPeriodNewline != null) {
      json[r'pattern.newline'] = this.patternPeriodNewline;
    } else {
      json[r'pattern.newline'] = null;
    }
    if (this.patternPeriodDayOfMonth != null) {
      json[r'pattern.dayOfMonth'] = this.patternPeriodDayOfMonth;
    } else {
      json[r'pattern.dayOfMonth'] = null;
    }
    if (this.patternPeriodMonth != null) {
      json[r'pattern.month'] = this.patternPeriodMonth;
    } else {
      json[r'pattern.month'] = null;
    }
    if (this.patternPeriodYear != null) {
      json[r'pattern.year'] = this.patternPeriodYear;
    } else {
      json[r'pattern.year'] = null;
    }
    if (this.patternPeriodDate != null) {
      json[r'pattern.date'] = this.patternPeriodDate;
    } else {
      json[r'pattern.date'] = null;
    }
    if (this.patternPeriodDateTime != null) {
      json[r'pattern.dateTime'] = this.patternPeriodDateTime;
    } else {
      json[r'pattern.dateTime'] = null;
    }
    if (this.patternPeriodEmail != null) {
      json[r'pattern.email'] = this.patternPeriodEmail;
    } else {
      json[r'pattern.email'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(
        patternPeriodTime: ConfigNodePropertyString.fromJson(json[r'pattern.time']),
        patternPeriodNewline: ConfigNodePropertyString.fromJson(json[r'pattern.newline']),
        patternPeriodDayOfMonth: ConfigNodePropertyString.fromJson(json[r'pattern.dayOfMonth']),
        patternPeriodMonth: ConfigNodePropertyString.fromJson(json[r'pattern.month']),
        patternPeriodYear: ConfigNodePropertyString.fromJson(json[r'pattern.year']),
        patternPeriodDate: ConfigNodePropertyString.fromJson(json[r'pattern.date']),
        patternPeriodDateTime: ConfigNodePropertyString.fromJson(json[r'pattern.dateTime']),
        patternPeriodEmail: ConfigNodePropertyString.fromJson(json[r'pattern.email']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

