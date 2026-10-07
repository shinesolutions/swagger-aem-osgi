//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_searchpromote_impl_search_promote_service_impl_properties.g.dart';

/// ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties
///
/// Properties:
/// * [cqPeriodSearchpromotePeriodConfigurationPeriodServerPeriodUri] 
/// * [cqPeriodSearchpromotePeriodConfigurationPeriodEnvironment] 
/// * [connectionPeriodTimeout] 
/// * [socketPeriodTimeout] 
@BuiltValue()
abstract class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties implements Built<ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties, ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.searchpromote.configuration.server.uri')
  ConfigNodePropertyString? get cqPeriodSearchpromotePeriodConfigurationPeriodServerPeriodUri;

  @BuiltValueField(wireName: r'cq.searchpromote.configuration.environment')
  ConfigNodePropertyString? get cqPeriodSearchpromotePeriodConfigurationPeriodEnvironment;

  @BuiltValueField(wireName: r'connection.timeout')
  ConfigNodePropertyInteger? get connectionPeriodTimeout;

  @BuiltValueField(wireName: r'socket.timeout')
  ConfigNodePropertyInteger? get socketPeriodTimeout;

  ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties._();

  factory ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties([void updates(ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder b)]) = _$ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties> get serializer => _$ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesSerializer();
}

class _$ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties, _$ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties];

  @override
  final String wireName = r'ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodSearchpromotePeriodConfigurationPeriodServerPeriodUri != null) {
      yield r'cq.searchpromote.configuration.server.uri';
      yield serializers.serialize(
        object.cqPeriodSearchpromotePeriodConfigurationPeriodServerPeriodUri,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodSearchpromotePeriodConfigurationPeriodEnvironment != null) {
      yield r'cq.searchpromote.configuration.environment';
      yield serializers.serialize(
        object.cqPeriodSearchpromotePeriodConfigurationPeriodEnvironment,
        specifiedType: const FullType(ConfigNodePropertyString),
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
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.searchpromote.configuration.server.uri':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodSearchpromotePeriodConfigurationPeriodServerPeriodUri.replace(valueDes);
          break;
        case r'cq.searchpromote.configuration.environment':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodSearchpromotePeriodConfigurationPeriodEnvironment.replace(valueDes);
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
  ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesBuilder();
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

