//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties.g.dart';

/// ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
///
/// Properties:
/// * [offloadingPeriodAgentmanagerPeriodEnabled] 
@BuiltValue()
abstract class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties implements Built<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties, ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder> {
  @BuiltValueField(wireName: r'offloading.agentmanager.enabled')
  ConfigNodePropertyBoolean? get offloadingPeriodAgentmanagerPeriodEnabled;

  ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties._();

  factory ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties([void updates(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder b)]) = _$ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties> get serializer => _$ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesSerializer();
}

class _$ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties, _$ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties];

  @override
  final String wireName = r'ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.offloadingPeriodAgentmanagerPeriodEnabled != null) {
      yield r'offloading.agentmanager.enabled';
      yield serializers.serialize(
        object.offloadingPeriodAgentmanagerPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'offloading.agentmanager.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.offloadingPeriodAgentmanagerPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesBuilder();
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

