//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties.g.dart';

/// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
///
/// Properties:
/// * [automoderationPeriodSequence] 
/// * [automoderationPeriodOnfailurestop] 
@BuiltValue()
abstract class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties implements Built<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'automoderation.sequence')
  ConfigNodePropertyArray? get automoderationPeriodSequence;

  @BuiltValueField(wireName: r'automoderation.onfailurestop')
  ConfigNodePropertyBoolean? get automoderationPeriodOnfailurestop;

  ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties._();

  factory ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties([void updates(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder b)]) = _$ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties> get serializer => _$ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesSerializer();
}

class _$ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties, _$ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.automoderationPeriodSequence != null) {
      yield r'automoderation.sequence';
      yield serializers.serialize(
        object.automoderationPeriodSequence,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.automoderationPeriodOnfailurestop != null) {
      yield r'automoderation.onfailurestop';
      yield serializers.serialize(
        object.automoderationPeriodOnfailurestop,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'automoderation.sequence':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.automoderationPeriodSequence.replace(valueDes);
          break;
        case r'automoderation.onfailurestop':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.automoderationPeriodOnfailurestop.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesBuilder();
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

