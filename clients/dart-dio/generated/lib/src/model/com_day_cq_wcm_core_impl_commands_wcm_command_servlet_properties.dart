//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_impl_commands_wcm_command_servlet_properties.g.dart';

/// ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
///
/// Properties:
/// * [wcmcommandservletPeriodDeleteWhitelist] 
@BuiltValue()
abstract class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties implements Built<ComDayCqWcmCoreImplCommandsWCMCommandServletProperties, ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'wcmcommandservlet.delete_whitelist')
  ConfigNodePropertyArray? get wcmcommandservletPeriodDeleteWhitelist;

  ComDayCqWcmCoreImplCommandsWCMCommandServletProperties._();

  factory ComDayCqWcmCoreImplCommandsWCMCommandServletProperties([void updates(ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder b)]) = _$ComDayCqWcmCoreImplCommandsWCMCommandServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreImplCommandsWCMCommandServletProperties> get serializer => _$ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesSerializer();
}

class _$ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreImplCommandsWCMCommandServletProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreImplCommandsWCMCommandServletProperties, _$ComDayCqWcmCoreImplCommandsWCMCommandServletProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreImplCommandsWCMCommandServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.wcmcommandservletPeriodDeleteWhitelist != null) {
      yield r'wcmcommandservlet.delete_whitelist';
      yield serializers.serialize(
        object.wcmcommandservletPeriodDeleteWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'wcmcommandservlet.delete_whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.wcmcommandservletPeriodDeleteWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreImplCommandsWCMCommandServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreImplCommandsWCMCommandServletPropertiesBuilder();
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

