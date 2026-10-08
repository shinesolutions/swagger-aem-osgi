//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_service_web_service_impl_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
///
/// Properties:
/// * [endpointUri] 
/// * [connectionTimeout] 
/// * [socketTimeout] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties implements Built<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties, ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'endpointUri')
  ConfigNodePropertyString? get endpointUri;

  @BuiltValueField(wireName: r'connectionTimeout')
  ConfigNodePropertyInteger? get connectionTimeout;

  @BuiltValueField(wireName: r'socketTimeout')
  ConfigNodePropertyInteger? get socketTimeout;

  ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties._();

  factory ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties([void updates(ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties, _$ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.endpointUri != null) {
      yield r'endpointUri';
      yield serializers.serialize(
        object.endpointUri,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.connectionTimeout != null) {
      yield r'connectionTimeout';
      yield serializers.serialize(
        object.connectionTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.socketTimeout != null) {
      yield r'socketTimeout';
      yield serializers.serialize(
        object.socketTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'endpointUri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.endpointUri.replace(valueDes);
          break;
        case r'connectionTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectionTimeout.replace(valueDes);
          break;
        case r'socketTimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.socketTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesBuilder();
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

