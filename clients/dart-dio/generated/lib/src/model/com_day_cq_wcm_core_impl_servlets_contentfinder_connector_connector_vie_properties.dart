//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties.g.dart';

/// ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
///
/// Properties:
/// * [itemPeriodResourcePeriodTypes] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties implements Built<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder> {
  @BuiltValueField(wireName: r'item.resource.types')
  ConfigNodePropertyArray? get itemPeriodResourcePeriodTypes;

  ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties._();

  factory ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties([void updates(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder b)]) = _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties> get serializer => _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesSerializer();
}

class _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties, _$ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.itemPeriodResourcePeriodTypes != null) {
      yield r'item.resource.types';
      yield serializers.serialize(
        object.itemPeriodResourcePeriodTypes,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'item.resource.types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.itemPeriodResourcePeriodTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesBuilder();
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

