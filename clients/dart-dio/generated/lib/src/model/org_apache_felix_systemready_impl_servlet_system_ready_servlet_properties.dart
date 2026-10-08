//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_felix_systemready_impl_servlet_system_ready_servlet_properties.g.dart';

/// OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties
///
/// Properties:
/// * [osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern] 
/// * [osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect] 
@BuiltValue()
abstract class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties implements Built<OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties, OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'osgi.http.whiteboard.servlet.pattern')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern;

  @BuiltValueField(wireName: r'osgi.http.whiteboard.context.select')
  ConfigNodePropertyString? get osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties._();

  factory OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties([void updates(OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder b)]) = _$OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties> get serializer => _$OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesSerializer();
}

class _$OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties, _$OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties];

  @override
  final String wireName = r'OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties object, {
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
    OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder result,
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
  OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder();
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

