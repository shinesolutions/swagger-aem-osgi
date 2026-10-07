//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties.g.dart';

/// ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
///
/// Properties:
/// * [cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties implements Built<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties, ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.searchpromote.confighandler.enabled')
  ConfigNodePropertyBoolean? get cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled;

  ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties._();

  factory ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties([void updates(ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder b)]) = _$ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties> get serializer => _$ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesSerializer();
}

class _$ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties, _$ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties];

  @override
  final String wireName = r'ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled != null) {
      yield r'cq.searchpromote.confighandler.enabled';
      yield serializers.serialize(
        object.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.searchpromote.confighandler.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodSearchpromotePeriodConfighandlerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesBuilder();
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

