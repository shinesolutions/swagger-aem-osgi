//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_properties.g.dart';

/// ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties
///
/// Properties:
/// * [isMemberCheck] 
@BuiltValue()
abstract class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties implements Built<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties, ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder> {
  @BuiltValueField(wireName: r'isMemberCheck')
  ConfigNodePropertyBoolean? get isMemberCheck;

  ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties._();

  factory ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties([void updates(ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder b)]) = _$ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties> get serializer => _$ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesSerializer();
}

class _$ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties, _$ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties];

  @override
  final String wireName = r'ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.isMemberCheck != null) {
      yield r'isMemberCheck';
      yield serializers.serialize(
        object.isMemberCheck,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'isMemberCheck':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.isMemberCheck.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder();
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

