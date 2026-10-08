//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
  /// Returns a new [ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties] instance.
  ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties({
    this.mailerPeriodEmailPeriodEmbed,
    this.mailerPeriodEmailPeriodCharset,
    this.mailerPeriodEmailPeriodRetrieverUserID,
    this.mailerPeriodEmailPeriodRetrieverUserPWD,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? mailerPeriodEmailPeriodEmbed;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? mailerPeriodEmailPeriodCharset;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? mailerPeriodEmailPeriodRetrieverUserID;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? mailerPeriodEmailPeriodRetrieverUserPWD;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties &&
    other.mailerPeriodEmailPeriodEmbed == mailerPeriodEmailPeriodEmbed &&
    other.mailerPeriodEmailPeriodCharset == mailerPeriodEmailPeriodCharset &&
    other.mailerPeriodEmailPeriodRetrieverUserID == mailerPeriodEmailPeriodRetrieverUserID &&
    other.mailerPeriodEmailPeriodRetrieverUserPWD == mailerPeriodEmailPeriodRetrieverUserPWD;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mailerPeriodEmailPeriodEmbed == null ? 0 : mailerPeriodEmailPeriodEmbed!.hashCode) +
    (mailerPeriodEmailPeriodCharset == null ? 0 : mailerPeriodEmailPeriodCharset!.hashCode) +
    (mailerPeriodEmailPeriodRetrieverUserID == null ? 0 : mailerPeriodEmailPeriodRetrieverUserID!.hashCode) +
    (mailerPeriodEmailPeriodRetrieverUserPWD == null ? 0 : mailerPeriodEmailPeriodRetrieverUserPWD!.hashCode);

  @override
  String toString() => 'ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties[mailerPeriodEmailPeriodEmbed=$mailerPeriodEmailPeriodEmbed, mailerPeriodEmailPeriodCharset=$mailerPeriodEmailPeriodCharset, mailerPeriodEmailPeriodRetrieverUserID=$mailerPeriodEmailPeriodRetrieverUserID, mailerPeriodEmailPeriodRetrieverUserPWD=$mailerPeriodEmailPeriodRetrieverUserPWD]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mailerPeriodEmailPeriodEmbed != null) {
      json[r'mailer.email.embed'] = this.mailerPeriodEmailPeriodEmbed;
    } else {
      json[r'mailer.email.embed'] = null;
    }
    if (this.mailerPeriodEmailPeriodCharset != null) {
      json[r'mailer.email.charset'] = this.mailerPeriodEmailPeriodCharset;
    } else {
      json[r'mailer.email.charset'] = null;
    }
    if (this.mailerPeriodEmailPeriodRetrieverUserID != null) {
      json[r'mailer.email.retrieverUserID'] = this.mailerPeriodEmailPeriodRetrieverUserID;
    } else {
      json[r'mailer.email.retrieverUserID'] = null;
    }
    if (this.mailerPeriodEmailPeriodRetrieverUserPWD != null) {
      json[r'mailer.email.retrieverUserPWD'] = this.mailerPeriodEmailPeriodRetrieverUserPWD;
    } else {
      json[r'mailer.email.retrieverUserPWD'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(
        mailerPeriodEmailPeriodEmbed: ConfigNodePropertyBoolean.fromJson(json[r'mailer.email.embed']),
        mailerPeriodEmailPeriodCharset: ConfigNodePropertyString.fromJson(json[r'mailer.email.charset']),
        mailerPeriodEmailPeriodRetrieverUserID: ConfigNodePropertyString.fromJson(json[r'mailer.email.retrieverUserID']),
        mailerPeriodEmailPeriodRetrieverUserPWD: ConfigNodePropertyString.fromJson(json[r'mailer.email.retrieverUserPWD']),
      );
    }
    return null;
  }

  static List<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties-objects as value to a dart map
  static Map<String, List<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

