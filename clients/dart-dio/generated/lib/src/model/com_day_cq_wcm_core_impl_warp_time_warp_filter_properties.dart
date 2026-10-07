//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_warp_time_warp_filter_properties.g.dart';

/// ComDayCqWcmCoreImplWarpTimeWarpFilterProperties
///
/// Properties:
/// * [filterPeriodOrder] 
/// * [filterPeriodScope] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties implements Built<ComDayCqWcmCoreImplWarpTimeWarpFilterProperties, ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'filter.order')
  ConfigNodePropertyString? get filterPeriodOrder;

  @BuiltValueField(wireName: r'filter.scope')
  ConfigNodePropertyString? get filterPeriodScope;

  ComDayCqWcmCoreImplWarpTimeWarpFilterProperties._();

  factory ComDayCqWcmCoreImplWarpTimeWarpFilterProperties([void updates(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplWarpTimeWarpFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplWarpTimeWarpFilterProperties> get serializer => _$ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplWarpTimeWarpFilterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplWarpTimeWarpFilterProperties, _$ComDayCqWcmCoreImplWarpTimeWarpFilterProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplWarpTimeWarpFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.filterPeriodOrder != null) {
      yield r'filter.order';
      yield serializers.serialize(
        object.filterPeriodOrder,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.filterPeriodScope != null) {
      yield r'filter.scope';
      yield serializers.serialize(
        object.filterPeriodScope,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'filter.order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filterPeriodOrder.replace(valueDes);
          break;
        case r'filter.scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.filterPeriodScope.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplWarpTimeWarpFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplWarpTimeWarpFilterPropertiesBuilder();
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

