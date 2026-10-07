//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties.g.dart';

/// ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
///
/// Properties:
/// * [watchwordsPeriodPositive] 
/// * [watchwordsPeriodNegative] 
/// * [watchwordsPeriodPath] 
/// * [sentimentPeriodPath] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties implements Built<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder> {
  @BuiltValueField(wireName: r'watchwords.positive')
  ConfigNodePropertyArray? get watchwordsPeriodPositive;

  @BuiltValueField(wireName: r'watchwords.negative')
  ConfigNodePropertyArray? get watchwordsPeriodNegative;

  @BuiltValueField(wireName: r'watchwords.path')
  ConfigNodePropertyString? get watchwordsPeriodPath;

  @BuiltValueField(wireName: r'sentiment.path')
  ConfigNodePropertyString? get sentimentPeriodPath;

  ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties._();

  factory ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties([void updates(ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties> get serializer => _$ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties, _$ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.watchwordsPeriodPositive != null) {
      yield r'watchwords.positive';
      yield serializers.serialize(
        object.watchwordsPeriodPositive,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.watchwordsPeriodNegative != null) {
      yield r'watchwords.negative';
      yield serializers.serialize(
        object.watchwordsPeriodNegative,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.watchwordsPeriodPath != null) {
      yield r'watchwords.path';
      yield serializers.serialize(
        object.watchwordsPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.sentimentPeriodPath != null) {
      yield r'sentiment.path';
      yield serializers.serialize(
        object.sentimentPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'watchwords.positive':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.watchwordsPeriodPositive.replace(valueDes);
          break;
        case r'watchwords.negative':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.watchwordsPeriodNegative.replace(valueDes);
          break;
        case r'watchwords.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.watchwordsPeriodPath.replace(valueDes);
          break;
        case r'sentiment.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.sentimentPeriodPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder();
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

