//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_properties.g.dart';

/// OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties
///
/// Properties:
/// * [maxPeriodSize] 
@BuiltValue()
abstract class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties implements Built<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties, OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'max.size')
  ConfigNodePropertyInteger? get maxPeriodSize;

  OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties._();

  factory OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties([void updates(OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder b)]) = _$OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties> get serializer => _$OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesSerializer();
}

class _$OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties, _$OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties];

  @override
  final String wireName = r'OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.maxPeriodSize != null) {
      yield r'max.size';
      yield serializers.serialize(
        object.maxPeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesBuilder();
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

