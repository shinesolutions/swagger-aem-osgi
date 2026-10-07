//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
///
/// Properties:
/// * [patternPeriodTime] 
/// * [patternPeriodNewline] 
/// * [patternPeriodDayOfMonth] 
/// * [patternPeriodMonth] 
/// * [patternPeriodYear] 
/// * [patternPeriodDate] 
/// * [patternPeriodDateTime] 
/// * [patternPeriodEmail] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder> {
  @BuiltValueField(wireName: r'pattern.time')
  ConfigNodePropertyString? get patternPeriodTime;

  @BuiltValueField(wireName: r'pattern.newline')
  ConfigNodePropertyString? get patternPeriodNewline;

  @BuiltValueField(wireName: r'pattern.dayOfMonth')
  ConfigNodePropertyString? get patternPeriodDayOfMonth;

  @BuiltValueField(wireName: r'pattern.month')
  ConfigNodePropertyString? get patternPeriodMonth;

  @BuiltValueField(wireName: r'pattern.year')
  ConfigNodePropertyString? get patternPeriodYear;

  @BuiltValueField(wireName: r'pattern.date')
  ConfigNodePropertyString? get patternPeriodDate;

  @BuiltValueField(wireName: r'pattern.dateTime')
  ConfigNodePropertyString? get patternPeriodDateTime;

  @BuiltValueField(wireName: r'pattern.email')
  ConfigNodePropertyString? get patternPeriodEmail;

  ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties, _$ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.patternPeriodTime != null) {
      yield r'pattern.time';
      yield serializers.serialize(
        object.patternPeriodTime,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodNewline != null) {
      yield r'pattern.newline';
      yield serializers.serialize(
        object.patternPeriodNewline,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodDayOfMonth != null) {
      yield r'pattern.dayOfMonth';
      yield serializers.serialize(
        object.patternPeriodDayOfMonth,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodMonth != null) {
      yield r'pattern.month';
      yield serializers.serialize(
        object.patternPeriodMonth,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodYear != null) {
      yield r'pattern.year';
      yield serializers.serialize(
        object.patternPeriodYear,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodDate != null) {
      yield r'pattern.date';
      yield serializers.serialize(
        object.patternPeriodDate,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodDateTime != null) {
      yield r'pattern.dateTime';
      yield serializers.serialize(
        object.patternPeriodDateTime,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.patternPeriodEmail != null) {
      yield r'pattern.email';
      yield serializers.serialize(
        object.patternPeriodEmail,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pattern.time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodTime.replace(valueDes);
          break;
        case r'pattern.newline':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodNewline.replace(valueDes);
          break;
        case r'pattern.dayOfMonth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodDayOfMonth.replace(valueDes);
          break;
        case r'pattern.month':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodMonth.replace(valueDes);
          break;
        case r'pattern.year':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodYear.replace(valueDes);
          break;
        case r'pattern.date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodDate.replace(valueDes);
          break;
        case r'pattern.dateTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodDateTime.replace(valueDes);
          break;
        case r'pattern.email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.patternPeriodEmail.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

