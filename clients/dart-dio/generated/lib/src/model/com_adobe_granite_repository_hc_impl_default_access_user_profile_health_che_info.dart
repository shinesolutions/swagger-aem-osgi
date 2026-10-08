//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_info.g.dart';

/// ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo implements Built<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo, ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties? get properties;

  ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo._();

  factory ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo([void updates(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder b)]) = _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo> get serializer => _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoSerializer();
}

class _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoSerializer implements PrimitiveSerializer<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo, _$ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo];

  @override
  final String wireName = r'ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo object, {
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
        specifiedType: const FullType(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder result,
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
            specifiedType: const FullType.nullable(ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties),
          ) as ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties?;
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
  ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoBuilder();
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

