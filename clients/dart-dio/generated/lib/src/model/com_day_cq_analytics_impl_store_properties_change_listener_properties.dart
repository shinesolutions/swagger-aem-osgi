//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_impl_store_properties_change_listener_properties.g.dart';

/// ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties
///
/// Properties:
/// * [cqPeriodStorePeriodListenerPeriodAdditionalStorePaths] 
@BuiltValue()
abstract class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties implements Built<ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties, ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.store.listener.additionalStorePaths')
  ConfigNodePropertyArray? get cqPeriodStorePeriodListenerPeriodAdditionalStorePaths;

  ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties._();

  factory ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties([void updates(ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder b)]) = _$ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties> get serializer => _$ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesSerializer();
}

class _$ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties, _$ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodStorePeriodListenerPeriodAdditionalStorePaths != null) {
      yield r'cq.store.listener.additionalStorePaths';
      yield serializers.serialize(
        object.cqPeriodStorePeriodListenerPeriodAdditionalStorePaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.store.listener.additionalStorePaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodStorePeriodListenerPeriodAdditionalStorePaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesBuilder();
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

