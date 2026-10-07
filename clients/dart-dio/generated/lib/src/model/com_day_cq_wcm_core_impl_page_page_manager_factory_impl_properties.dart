//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties.g.dart';

/// ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties
///
/// Properties:
/// * [illegalCharMapping] 
/// * [pageSubTreeActivationCheck] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties implements Built<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties, ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'illegalCharMapping')
  ConfigNodePropertyString? get illegalCharMapping;

  @BuiltValueField(wireName: r'pageSubTreeActivationCheck')
  ConfigNodePropertyBoolean? get pageSubTreeActivationCheck;

  ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties._();

  factory ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties([void updates(ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties> get serializer => _$ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties, _$ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.illegalCharMapping != null) {
      yield r'illegalCharMapping';
      yield serializers.serialize(
        object.illegalCharMapping,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pageSubTreeActivationCheck != null) {
      yield r'pageSubTreeActivationCheck';
      yield serializers.serialize(
        object.pageSubTreeActivationCheck,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'illegalCharMapping':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.illegalCharMapping.replace(valueDes);
          break;
        case r'pageSubTreeActivationCheck':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.pageSubTreeActivationCheck.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesBuilder();
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

