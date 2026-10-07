//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties] instance.
  ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties({
    this.emailPeriodName,
    this.emailPeriodCreatePostFromReply,
    this.emailPeriodAddCommentIdTo,
    this.emailPeriodSubjectMaximumLength,
    this.emailPeriodReplyToAddress,
    this.emailPeriodReplyToDelimiter,
    this.emailPeriodTrackerIdPrefixInSubject,
    this.emailPeriodTrackerIdPrefixInBody,
    this.emailPeriodAsHTML,
    this.emailPeriodDefaultUserName,
    this.emailPeriodTemplatesPeriodRootPath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? emailPeriodCreatePostFromReply;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? emailPeriodAddCommentIdTo;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? emailPeriodSubjectMaximumLength;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodReplyToAddress;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodReplyToDelimiter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodTrackerIdPrefixInSubject;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodTrackerIdPrefixInBody;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? emailPeriodAsHTML;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodDefaultUserName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? emailPeriodTemplatesPeriodRootPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties &&
    other.emailPeriodName == emailPeriodName &&
    other.emailPeriodCreatePostFromReply == emailPeriodCreatePostFromReply &&
    other.emailPeriodAddCommentIdTo == emailPeriodAddCommentIdTo &&
    other.emailPeriodSubjectMaximumLength == emailPeriodSubjectMaximumLength &&
    other.emailPeriodReplyToAddress == emailPeriodReplyToAddress &&
    other.emailPeriodReplyToDelimiter == emailPeriodReplyToDelimiter &&
    other.emailPeriodTrackerIdPrefixInSubject == emailPeriodTrackerIdPrefixInSubject &&
    other.emailPeriodTrackerIdPrefixInBody == emailPeriodTrackerIdPrefixInBody &&
    other.emailPeriodAsHTML == emailPeriodAsHTML &&
    other.emailPeriodDefaultUserName == emailPeriodDefaultUserName &&
    other.emailPeriodTemplatesPeriodRootPath == emailPeriodTemplatesPeriodRootPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (emailPeriodName == null ? 0 : emailPeriodName!.hashCode) +
    (emailPeriodCreatePostFromReply == null ? 0 : emailPeriodCreatePostFromReply!.hashCode) +
    (emailPeriodAddCommentIdTo == null ? 0 : emailPeriodAddCommentIdTo!.hashCode) +
    (emailPeriodSubjectMaximumLength == null ? 0 : emailPeriodSubjectMaximumLength!.hashCode) +
    (emailPeriodReplyToAddress == null ? 0 : emailPeriodReplyToAddress!.hashCode) +
    (emailPeriodReplyToDelimiter == null ? 0 : emailPeriodReplyToDelimiter!.hashCode) +
    (emailPeriodTrackerIdPrefixInSubject == null ? 0 : emailPeriodTrackerIdPrefixInSubject!.hashCode) +
    (emailPeriodTrackerIdPrefixInBody == null ? 0 : emailPeriodTrackerIdPrefixInBody!.hashCode) +
    (emailPeriodAsHTML == null ? 0 : emailPeriodAsHTML!.hashCode) +
    (emailPeriodDefaultUserName == null ? 0 : emailPeriodDefaultUserName!.hashCode) +
    (emailPeriodTemplatesPeriodRootPath == null ? 0 : emailPeriodTemplatesPeriodRootPath!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties[emailPeriodName=$emailPeriodName, emailPeriodCreatePostFromReply=$emailPeriodCreatePostFromReply, emailPeriodAddCommentIdTo=$emailPeriodAddCommentIdTo, emailPeriodSubjectMaximumLength=$emailPeriodSubjectMaximumLength, emailPeriodReplyToAddress=$emailPeriodReplyToAddress, emailPeriodReplyToDelimiter=$emailPeriodReplyToDelimiter, emailPeriodTrackerIdPrefixInSubject=$emailPeriodTrackerIdPrefixInSubject, emailPeriodTrackerIdPrefixInBody=$emailPeriodTrackerIdPrefixInBody, emailPeriodAsHTML=$emailPeriodAsHTML, emailPeriodDefaultUserName=$emailPeriodDefaultUserName, emailPeriodTemplatesPeriodRootPath=$emailPeriodTemplatesPeriodRootPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.emailPeriodName != null) {
      json[r'email.name'] = this.emailPeriodName;
    } else {
      json[r'email.name'] = null;
    }
    if (this.emailPeriodCreatePostFromReply != null) {
      json[r'email.createPostFromReply'] = this.emailPeriodCreatePostFromReply;
    } else {
      json[r'email.createPostFromReply'] = null;
    }
    if (this.emailPeriodAddCommentIdTo != null) {
      json[r'email.addCommentIdTo'] = this.emailPeriodAddCommentIdTo;
    } else {
      json[r'email.addCommentIdTo'] = null;
    }
    if (this.emailPeriodSubjectMaximumLength != null) {
      json[r'email.subjectMaximumLength'] = this.emailPeriodSubjectMaximumLength;
    } else {
      json[r'email.subjectMaximumLength'] = null;
    }
    if (this.emailPeriodReplyToAddress != null) {
      json[r'email.replyToAddress'] = this.emailPeriodReplyToAddress;
    } else {
      json[r'email.replyToAddress'] = null;
    }
    if (this.emailPeriodReplyToDelimiter != null) {
      json[r'email.replyToDelimiter'] = this.emailPeriodReplyToDelimiter;
    } else {
      json[r'email.replyToDelimiter'] = null;
    }
    if (this.emailPeriodTrackerIdPrefixInSubject != null) {
      json[r'email.trackerIdPrefixInSubject'] = this.emailPeriodTrackerIdPrefixInSubject;
    } else {
      json[r'email.trackerIdPrefixInSubject'] = null;
    }
    if (this.emailPeriodTrackerIdPrefixInBody != null) {
      json[r'email.trackerIdPrefixInBody'] = this.emailPeriodTrackerIdPrefixInBody;
    } else {
      json[r'email.trackerIdPrefixInBody'] = null;
    }
    if (this.emailPeriodAsHTML != null) {
      json[r'email.asHTML'] = this.emailPeriodAsHTML;
    } else {
      json[r'email.asHTML'] = null;
    }
    if (this.emailPeriodDefaultUserName != null) {
      json[r'email.defaultUserName'] = this.emailPeriodDefaultUserName;
    } else {
      json[r'email.defaultUserName'] = null;
    }
    if (this.emailPeriodTemplatesPeriodRootPath != null) {
      json[r'email.templates.rootPath'] = this.emailPeriodTemplatesPeriodRootPath;
    } else {
      json[r'email.templates.rootPath'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(
        emailPeriodName: ConfigNodePropertyString.fromJson(json[r'email.name']),
        emailPeriodCreatePostFromReply: ConfigNodePropertyBoolean.fromJson(json[r'email.createPostFromReply']),
        emailPeriodAddCommentIdTo: ConfigNodePropertyDropDown.fromJson(json[r'email.addCommentIdTo']),
        emailPeriodSubjectMaximumLength: ConfigNodePropertyInteger.fromJson(json[r'email.subjectMaximumLength']),
        emailPeriodReplyToAddress: ConfigNodePropertyString.fromJson(json[r'email.replyToAddress']),
        emailPeriodReplyToDelimiter: ConfigNodePropertyString.fromJson(json[r'email.replyToDelimiter']),
        emailPeriodTrackerIdPrefixInSubject: ConfigNodePropertyString.fromJson(json[r'email.trackerIdPrefixInSubject']),
        emailPeriodTrackerIdPrefixInBody: ConfigNodePropertyString.fromJson(json[r'email.trackerIdPrefixInBody']),
        emailPeriodAsHTML: ConfigNodePropertyBoolean.fromJson(json[r'email.asHTML']),
        emailPeriodDefaultUserName: ConfigNodePropertyString.fromJson(json[r'email.defaultUserName']),
        emailPeriodTemplatesPeriodRootPath: ConfigNodePropertyString.fromJson(json[r'email.templates.rootPath']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

