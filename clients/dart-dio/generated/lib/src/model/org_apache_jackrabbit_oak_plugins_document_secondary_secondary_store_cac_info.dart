//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info.g.dart';

/// OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo implements Built<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties? get properties;

  OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo._();

  factory OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo([void updates(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder b)]) = _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo> get serializer => _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoSerializer();
}

class _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo, _$OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties),
          ) as OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder();
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

