//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_systemready_impl_servlet_system_alive_servlet_properties.g.dart';

/// OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
///
/// Properties:
/// * [osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern] 
/// * [osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect] 
@BuiltValue()
abstract class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties implements Built<OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties, OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'osgi.http.whiteboard.servlet.pattern')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern;

  @BuiltValueField(wireName: r'osgi.http.whiteboard.context.select')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties._();

  factory OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties([void updates(OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder b)]) = _$OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties> get serializer => _$OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesSerializer();
}

class _$OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties, _$OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties];

  @override
  final String wireName = r'OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern != null) {
      yield r'osgi.http.whiteboard.servlet.pattern';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect != null) {
      yield r'osgi.http.whiteboard.context.select';
      yield serializers.serialize(
        object.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'osgi.http.whiteboard.servlet.pattern':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern.replace(valueDes);
          break;
        case r'osgi.http.whiteboard.context.select':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder();
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

