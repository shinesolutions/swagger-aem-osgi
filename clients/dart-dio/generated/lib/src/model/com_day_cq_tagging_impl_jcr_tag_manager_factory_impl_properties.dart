//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties.g.dart';

/// ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
///
/// Properties:
/// * [validationPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties implements Built<ComDayCqTaggingImplJcrTagManagerFactoryImplProperties, ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'validation.enabled')
  ConfigNodePropertyBoolean? get validationPeriodEnabled;

  ComDayCqTaggingImplJcrTagManagerFactoryImplProperties._();

  factory ComDayCqTaggingImplJcrTagManagerFactoryImplProperties([void updates(ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder b)]) = _$ComDayCqTaggingImplJcrTagManagerFactoryImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqTaggingImplJcrTagManagerFactoryImplProperties> get serializer => _$ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesSerializer();
}

class _$ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqTaggingImplJcrTagManagerFactoryImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqTaggingImplJcrTagManagerFactoryImplProperties, _$ComDayCqTaggingImplJcrTagManagerFactoryImplProperties];

  @override
  final String wireName = r'ComDayCqTaggingImplJcrTagManagerFactoryImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqTaggingImplJcrTagManagerFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.validationPeriodEnabled != null) {
      yield r'validation.enabled';
      yield serializers.serialize(
        object.validationPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqTaggingImplJcrTagManagerFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'validation.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.validationPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqTaggingImplJcrTagManagerFactoryImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder();
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

