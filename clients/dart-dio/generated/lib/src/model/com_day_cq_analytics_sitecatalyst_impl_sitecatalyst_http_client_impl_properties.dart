//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties.g.dart';

/// ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl] 
/// * [devhostnamepatterns] 
/// * [connectionPeriodTimeout] 
/// * [socketPeriodTimeout] 
@BuiltValue()
abstract class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties implements Built<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties, ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.sitecatalyst.service.datacenter.url')
  ConfigNodePropertyArray? get cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl;

  @BuiltValueField(wireName: r'devhostnamepatterns')
  ConfigNodePropertyArray? get devhostnamepatterns;

  @BuiltValueField(wireName: r'connection.timeout')
  ConfigNodePropertyInteger? get connectionPeriodTimeout;

  @BuiltValueField(wireName: r'socket.timeout')
  ConfigNodePropertyInteger? get socketPeriodTimeout;

  ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties._();

  factory ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties([void updates(ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder b)]) = _$ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties> get serializer => _$ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesSerializer();
}

class _$ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties, _$ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl != null) {
      yield r'cq.analytics.sitecatalyst.service.datacenter.url';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.devhostnamepatterns != null) {
      yield r'devhostnamepatterns';
      yield serializers.serialize(
        object.devhostnamepatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.connectionPeriodTimeout != null) {
      yield r'connection.timeout';
      yield serializers.serialize(
        object.connectionPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.socketPeriodTimeout != null) {
      yield r'socket.timeout';
      yield serializers.serialize(
        object.socketPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.sitecatalyst.service.datacenter.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodSitecatalystPeriodServicePeriodDatacenterPeriodUrl.replace(valueDes);
          break;
        case r'devhostnamepatterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.devhostnamepatterns.replace(valueDes);
          break;
        case r'connection.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.connectionPeriodTimeout.replace(valueDes);
          break;
        case r'socket.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.socketPeriodTimeout.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesBuilder();
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

